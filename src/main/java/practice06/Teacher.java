package practice06;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String namme, int age) {
        super(namme, age);
    }

    public int getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        String prefix = super.introduce() + " I am a Teacher. I teach ";
        if (this.klass != 0){
            return prefix + "Class " + this.klass + ".";
        } else {
            return prefix + "No Class.";
        }
    }
}
