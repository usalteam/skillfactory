package module12;

import java.util.Objects;

public class Card {
    public final String color;
    public final String rank;

    public Card(String color, String rank) {
       if (color == null || rank == null) {
           throw new IllegalArgumentException();
       }
        this.color = color;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "color='" + color + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        return color.equals(card.color) && rank.equals(card.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, rank);
    }
}
