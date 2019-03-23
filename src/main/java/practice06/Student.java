package practice06;

public class Student extends Person {
    private int kclass;

    public int getKlass() {
        return kclass;
    }

    public void setKlass(int kclass) {
        this.kclass = kclass;
    }

    public Student(String name, int age, int kclass) {
        super(name, age);
        this.kclass = kclass;
    }
    public String introduce() {
        return super.introduce()+" "+"I am a Student. I am at Class "+kclass+".";
    }
}
