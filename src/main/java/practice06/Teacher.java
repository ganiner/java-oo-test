package practice06;

public class Teacher extends Person{
    private int kclass;
    public int getKlass() {
        return kclass;
    }

    public void setKlass(int kclass) {
        this.kclass = kclass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int kclass) {
        super(name, age);
        this.kclass = kclass;
    }
    public String introduce() {
        if(kclass>0){
            return super.introduce()+" "+"I am a Teacher. I teach Class "+kclass+".";
        }else{
            return super.introduce()+" "+"I am a Teacher. I teach No Class.";
        }

    }
}
