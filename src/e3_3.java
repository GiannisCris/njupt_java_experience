import java.util.InputMismatchException;
import java.util.Scanner;


public class e3_3 {
    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            double c = a/b;
        }catch (InputMismatchException e){
            System.out.println("Exception thrown  :" + e);
        }

        if(b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("被除数的值不能是 0");
        }
    }


}
