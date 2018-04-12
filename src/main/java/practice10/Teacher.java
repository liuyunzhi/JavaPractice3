package practice10;

import java.util.*;

public class Teacher extends Person{
    private Set<Klass> classes;

    public Teacher(int id, String name, int age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new HashSet<>();
    }

    private String myInformation() {
        return super.introduce() + " I am a Teacher.";
    }

    @Override
    public String introduce() {
        if (this.classes.isEmpty()) {
            return this.myInformation() + " I teach No Class.";
        } else {
            String prefix = this.myInformation() + " I teach Class ";
            List<Integer> numbers = new ArrayList<>();
            for (Klass value : classes) {
                numbers.add(value.getNumber());
            }
            numbers.sort((o1, o2)->(o1 - o2));
            StringBuilder string = new StringBuilder(numbers.toString());
            string.deleteCharAt(0);
            string.deleteCharAt(string.lastIndexOf("]"));
            return prefix + string + ".";
        }
    }

    public String introduceWith(Student student) {
        if (this.isTeaching(student)) {
            return this.myInformation() + " I teach " + student.getName() + ".";
        } else {
            return this.myInformation() + " I don't teach " + student.getName() + ".";
        }
    }

    public Set<Klass> getClasses() {
        return this.classes;
    }

    public boolean isTeaching(Student student) {
        for (Klass value : classes) {
            if (value.isIn(student)) {
                return true;
            }
        }
        return false;
    }
}
