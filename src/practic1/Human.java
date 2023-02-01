package practic1;

public class Human {
    public String name = "Alex";
    public int age = 30;
    public int weight = 80;
    public String address;

    public String work;
    public Human(int age, int weight, String address, String work) {
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
