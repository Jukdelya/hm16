package lesson23;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
    }
}
