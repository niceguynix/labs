import java.util.Scanner;

public class SortString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine();
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length-1; i++){
            for(int j = 0; j < ch.length -1; j++){
                if(ch[j+1] < ch[j]){
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted string: " + new String(ch));
        s.close();
    }
}
