public class Emp_para {
    int basic_sal;
    int hra;
    int da;
    int total_sal;

    Emp_para(int b, int h, int d) {
        basic_sal = b;
        hra = h;
        da = d;
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
        Emp_para e1 = new Emp_para(10000, 2000, 3000);
        e1.cal_sal();
        e1.print_details();
    }
}
