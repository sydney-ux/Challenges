public class factorial{
    public static int factorialNumber(int n) {
    // Function to calculate factorial of a number
    // using recursion    
    if (n==0 || n==1) {
        return 1;
    } else {
        return n * factorialNumber(n - 1);
    }
}
    public static void main(String[] args) {
      
        int result = factorialNumber(7);
        System.out.println("Factorial of " + 7 + " is: " + result);
    }
}
