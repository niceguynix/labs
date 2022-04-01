import java.util.Scanner;

public class Emp_def {
    int basic_sal;
    int hra;
    int da;
    int total_sal;

    Emp_def() {
        
    }

    void get_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary: ");
        basic_sal = sc.nextInt();
        System.out.println("Enter HRA: ");
        hra = sc.nextInt();
        System.out.println("Enter DA: ");
        da = sc.nextInt();
    }

    void cal_sal() {
        total_sal = basic_sal + hra + da;
    }

    void print_details(){
        System.out.println("Basic salary: "+basic_sal);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("Total salary: "+total_sal);
    }

    public static void main(String[] args) {
        Emp_def e1 = new Emp_def();
        e1.get_details();
        e1.cal_sal();
        e1.print_details();
    }
}
