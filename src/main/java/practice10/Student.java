package practice10;

public class Student extends Person {
    Klass kclass;

    public Student() {

    }


    public Klass getKlass() {
        return kclass;
    }

    public void setKlass(Klass kclass) {
        this.kclass = kclass;
    }
    public Student(int id, String name, int age, Klass kclass) {
        super(id, name, age);
        this.kclass = kclass;
    }

    public String introduce() {
        if (kclass.getLeader()==null){
            return super.introduce()+" "+"I am a Student. I am at Class "+kclass.getNumber()+".";
        }else {
            return super.introduce()+" "+"I am a Student. I am Leader of Class "+kclass.getNumber()+".";
        }

    }
}
