import java.util.Scanner;
public class InputExample {
    Scanner scanner = new Scanner(System.in);
    public void readNameAge(){
        String name;
        int age;
        System.out.print("What is your name:");
        name = scanner.next();

        System.out.print("What is your age?");
        age = scanner.nextInt();
        System.out.println("Hello"+ name +" you are "+ age + "years old.");
    }
    public static void main(String[] args) {
        InputExample u = new InputExample();
        u.readNameAge();
    }
}
