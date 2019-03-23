package practice09;

public class Teacher extends Person {
    Klass kclass;

    public Klass getKlass() {
        return kclass;
    }

    public void setKlass(Klass kclass) {
        this.kclass = kclass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass kclass) {
        super(id, name, age);
        this.kclass = kclass;
    }

    public String introduce() {
        if (kclass != null) {
            return super.introduce() + " " + "I am a Teacher. I teach Class " + kclass.getNumber() + ".";
        } else {
            return super.introduce() + " " + "I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == kclass.getNumber()) {
            return super.introduce() + " " + "I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " " + "I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}
