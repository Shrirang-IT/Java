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
        if (score >= 75){
            System.out.println("First class with distinction");
        }
        else if (score >=60 ){
            System.out.println("First Class");
        } else if (score >= 50) {
            System.out.println("Second class");

        }
    }

}
