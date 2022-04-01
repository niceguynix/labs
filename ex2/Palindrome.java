import java.util.Scanner;

class Palindrome{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();
        int len = str.length();
        int flag = 0;
        for(int i=0 ; i<len/2 ; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                flag = 1;
                System.out.println("Not a Palindrome");
                return;
            }
        }
        if(flag == 0){
            System.out.println("Palindrome");
        }
        s.close();
    }
}