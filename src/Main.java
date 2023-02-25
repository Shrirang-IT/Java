public class Main  {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HelloWorld helloWorld = new HelloWorld();
        Loops loops =new Loops();
        Result result=new Result();
        helloWorld.print();
        System.out.println(helloWorld.num);
        loops.check();
        result.check_score();

    }
}