package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "My name is " + name+ ". " + "I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        Person s =  (Person) obj;
        return this.id==s.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }
}