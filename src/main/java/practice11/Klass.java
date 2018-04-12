package practice11;

import java.util.HashSet;
import java.util.Set;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;
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
            if (this.teacher != null) {
                System.out.print("I am " + this.teacher.getName() + ". I know " + leader.getName()+ " become Leader of Class " + this.number + ".\n");
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        students.add(student);
        if (this.teacher != null) {
            System.out.print("I am " + this.teacher.getName() + ". I know " + student.getName()+ " has joined Class " + this.number + ".\n");
        }
    }

    public boolean isIn(Student student) {
        return students.contains(student);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
