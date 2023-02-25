import java.util.Scanner;

public class Result {

    private int score ;

    void get_input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the score  : " );
        score=sc.nextInt();
    }

    void check_score()
    {
        get_input();
       String varString = score >= 75 ? "First class with distinction" : "no distinction";     //ternary operator
       System.out.println(varString);

        if (score >=60 && score < 75  ){
            System.out.println("First Class");
        } else if (score >= 50 && score < 60  ) {
            System.out.println("Second class");

        }
        else System.out.println("Third class ");
    }


}
