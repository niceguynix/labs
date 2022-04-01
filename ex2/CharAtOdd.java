import java.util.Scanner;

public class CharAtOdd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        String inp = s.nextLine();
        System.out.println("The characters at odd index are:");
        for(int i=1;i<inp.length();i+=2){
            System.out.print(inp.charAt(i));
        }
        s.close();
    }
}
