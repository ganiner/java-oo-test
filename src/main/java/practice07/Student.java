package practice07;

public class Student extends Person {
    Klass kclass;

    public Klass getKlass() {
        return kclass;
    }

    public void setKlass(Klass kclass) {
        this.kclass = kclass;
    }

    public Student(String name, int age, Klass kclass) {
        super(name, age);
        this.kclass = kclass;
    }

    public String introduce() {
        return super.introduce()+" "+"I am a Student. I am at Class "+kclass.getNumber()+".";
    }
}
