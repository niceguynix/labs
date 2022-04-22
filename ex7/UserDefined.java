
class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
    }
}

public class UserDefined {
    public static void main(String args[]){
        try{
            int age = 10;
            if (age<18)
                throw new MyException("You are not eligible to vote");
            else
                System.out.println("You are eligible to vote");
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
