
import javax.print.event.PrintJobListener;

class supper1{

    protected void print() {
        System.out.println("print1!!");
    }

}

public class J13_1_1 {

    private String a = "1";

    private void print1(){
        System.out.println("print1!!");
    }

    public static void main(String[] args) {
        J13_1_1 c1 = new J13_1_1();
        c1.print1();
        c1.a = "3";
        System.out.println(c1.a);        
    }
}
