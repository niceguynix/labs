public class Kawasaki  extends Bike {
    final int speed = 300;
    String Brand="Kawasaki";
    public void print_details() {
        System.out.println("Brand: " + Brand);
        System.out.println("Speed: " + speed);
    }    

    public static void main(String[] args) {
        Kawasaki k1 = new Kawasaki();
        k1.print_details();
    }
}
