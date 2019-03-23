package practice10;

public class Klass {
    private int number;
    private Student leader;
    boolean flag;

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (!student.getKlass().flag){
            System.out.print("It is not one of us.\n");
        }else {
            student.getKlass().leader = student;
        }

    }
    public void appendMember(Student student) {
        student.getKlass().flag=true;
    }
}
