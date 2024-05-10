public class App {
    public static void main(String[] args) {
        // Fault: Trying to divide by zero
        int result = divide(10, 0);
        
        // Failure: Gây ra ngoại lệ khi chia cho 0
        System.out.println("Result: " + result);
    }
    
    public static int divide(int a, int b) {
        return a / b;
    }
}
