package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    private Klass kclass;
    private LinkedList<Klass> classes;

    public Klass getKlass() {
        return kclass;
    }

    public void setKlass(Klass kclass) {
        this.kclass = kclass;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.kclass = kclass;
        this.classes = classes;
    }

    public String introduce() {
        StringBuffer sb=new StringBuffer();
        if (classes != null&&classes.size()>0) {
            for (int i = 0; i <classes.size() ; i++) {
                 sb.append(classes.get(i).getNumber());
                 if (i<classes.size()-1){
                     sb.append(", ");
                 }
            }
            return super.introduce() + " " + "I am a Teacher. I teach Class " + sb + ".";
        } else {
            return super.introduce() + " " + "I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        if (this.classes.contains(student.getKlass())) {
            return super.introduce() + " " + "I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " " + "I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    boolean isTeaching(Student student){
        return this.getClasses().contains(student.getKlass());
    }

}
