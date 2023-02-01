package practic1;

public class Payer {
    String surname = "";
    String name = "";
    String address = "";
    String cardNumber = "";

    @Override
    public String toString() {
        return "Payer: " + surname + ' ' +
                name +
                ", address: " + address +
                ", cardNumber: " + cardNumber;
    }

    public Payer(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }


}
