public class Banana extends Fruit {
    void print_details() {
        System.out.println("Banana");
    }

    public static void main(String[] args) {
        Apple a = new Apple();
        Banana b1 = new Banana();
        a.print_details();
        b1.print_details();
    }
}
