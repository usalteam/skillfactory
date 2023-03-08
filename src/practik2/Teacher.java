package practik2;

public class Teacher extends People{
    String subject;
    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public String giveALesson() {
        return "The lesson was ended";
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public int getAge() {
        return super.age;
    }

    @Override
    public String getProfession() {
        return super.profession;
    }
}
