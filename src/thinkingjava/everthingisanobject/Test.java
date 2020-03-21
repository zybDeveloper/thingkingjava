package thinkingjava.everthingisanobject;

public class Test {


    public void test(){
        StaticTest s1 = new StaticTest();
        StaticTest s2 = new StaticTest();
        //s1.i;
    }

    public static void main(String[] args) {

        System.out.println("s1:" + StaticTest.i + "s2:" );
    }
}