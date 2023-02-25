import java.util.Scanner;

public class Loops {

    boolean var;

    void check () {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value ");
        var = sc.nextBoolean();
        if (var){
            System.out.println("The value is true");
        }
        else { System.out.println("THe above statement is false"); }
    }
}
