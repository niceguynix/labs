import java.util.Scanner;

public class CountOccurances {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();
        System.out.println("Enter a character: ");
        char ch = s.next().charAt(0);
        int count = 0;
        for(Character x:str.toCharArray()){
            if(x.equals(ch)){
                count++;
            }
        }
        System.out.println("Number of occurances of "+ch+": "+count);
        s.close();
    }
}
