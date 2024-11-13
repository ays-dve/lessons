package lesson8;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author fd=new Author("Fyodor", "Dostoevsky", 1821);
        Book bk=new Book("Crime and Punishment", 1866, fd);

        System.out.println(fd);

        int a=5;
        Integer b=5;
        System.out.println(b.doubleValue());

    }
}