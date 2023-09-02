package lesson21;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Dima", 33);
        Human human1 = new Human("Vitaliy", 25);
        human.printNumberOfPeople();
        human1.printNumberOfPeople();
    }
}
class Human{
    private String name;
    private int age;

    private static int countPeople;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people is: " + countPeople);
    }
}