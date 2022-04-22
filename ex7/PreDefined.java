
public class PreDefined {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
    }
}
