package practice08;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    private String myInformation() {
        return super.introduce() + " I am a Teacher.";
    }

    @Override
    public String introduce() {
        if (this.klass == null) {
            return this.myInformation() + " I teach No Class.";
        } else {
            return this.myInformation() + " I teach " + this.klass.getDisplayName() + ".";
        }
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduceWith(Student student) {
        if (student.getKlass() == this.klass) {
            return this.myInformation() + " I teach " + student.getName() + ".";
        } else {
            return this.myInformation() + " I don't teach " + student.getName() + ".";
        }
    }
}
