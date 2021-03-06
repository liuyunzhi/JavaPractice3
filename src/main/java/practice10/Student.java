package practice10;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        this.klass.appendMember(this);
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        if (this.equals(this.klass.getLeader())) {
            return super.introduce() + " I am a Student. I am Leader of " + this.klass.getDisplayName() + ".";
        } else {
            return super.introduce() + " I am a Student. I am at " + this.klass.getDisplayName() + ".";
        }
    }
}
