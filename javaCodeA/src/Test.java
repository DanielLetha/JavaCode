

/**
 * Created by daniel on 15/10/14.
 */
public class Test {


    public static void main(String[] args){
        Test test =new Test();
        test.compare1();
        test.compare2();

    }
    public Boolean compare1(){
        Boolean a = new Boolean(true);
        Boolean b = new Boolean(true);
        System.out.print(a==b);
    }

    public Boolean compare2(){
        Boolean a = new Boolean("true");
        Boolean b = new Boolean("true");
        System.out.print(a==b);

    }
}
