public class Android implements Phone {
    String type = "Android";
    public void print_details() {
        System.out.println("Type: " + type);
    }
    
    public static void main(String[] args) {
        
        Android b1 = new Android();
      
        b1.print_details();
    }
}
