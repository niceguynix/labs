import java.util.Scanner;

public class ExtractSubstr {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine();
        System.out.println("Enter indices for substring:");
        int start = s.nextInt();
        int end = s.nextInt();
        System.out.println("Substring: " + str.substring(start, end));
        s.close();
    }
}
