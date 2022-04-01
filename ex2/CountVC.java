import java.util.Scanner;

public class CountVC {

    public static boolean contains(Character x,Character[] arr){
        for(Character y:arr){
            if(x.equals(y)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();
        Character[] vowels = {'a','e','i','o','u'};
        int countVowels = 0;
        int countConsonants = 0;
        for(Character x:str.toCharArray()){
           if(contains(x,vowels)){
               countVowels++;
              }else{
                countConsonants++;
              }
        }

        System.out.println("Number of vowels: "+countVowels);
        System.out.println("Number of consonants: "+countConsonants);
        s.close();
    }
}
