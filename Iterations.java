import java.util.Scanner;
public class Iterations {
    Scanner sc = new Scanner(System.in);

    public void showHello(){
        String choice;//guard variable
        System.out.println("For Hello type h,anything else to stop");
        choice = sc.next();//set guard variable
        while("h".equals(choice)){
            System.out.println("Hello");
            choice = sc.next();//updates guard variable
        }

    }
    public static void main(String[] args) {
        Iterations vy = new Iterations();
        vy.showHello();
    }
}