package practice10;

import java.util.HashSet;
import java.util.Set;

public class Klass {
    private int number;
    private Student leader;
    private Set<Student> students;

    public Klass(int number) {
        this.number = number;
        this.students = new HashSet<>();
    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void assignLeader(Student leader) {
        if (students.contains(leader)) {
            this.leader = leader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        students.add(student);
    }

    public boolean isIn(Student student) {
        return students.contains(student);
    }
}
