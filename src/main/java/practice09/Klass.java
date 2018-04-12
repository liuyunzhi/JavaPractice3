package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students;

    public Klass(int number) {
        this.number = number;
        this.students = new ArrayList<>();
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
}
