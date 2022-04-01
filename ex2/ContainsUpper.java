import java.util.Scanner;

public class ContainsUpper {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inp = s.nextLine();
        String str = inp.toLowerCase();
        if(str.equals(inp)){
            System.out.println("String doesn't contain uppercase letters");
        }
        else{
            System.out.println("String contains uppercase letters");
        }
        s.close();
    } 
}
