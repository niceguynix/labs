public class Maruti extends Car {
    String brand = "Maruti";
    int speed = 100;
    int no_of_passengers=4;

    void print_details() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("No of wheels: " + no_of_wheels);
        System.out.println("No of passengers: " + no_of_passengers);
    }
    public static void main(String[] args) {
        Maruti m1 = new Maruti();
        m1.print_details();
    }
}
