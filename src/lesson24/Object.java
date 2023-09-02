package lesson24;

public class Object {
    public static void main(String[] args) {
        Human human = new Human("Ronald",21);
        System.out.println(human);
    }
}
class Human{
    private String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+" "+age;
    }
}