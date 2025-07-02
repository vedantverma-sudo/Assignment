public class Variables {

    String instancevar0= "hello from instancevar0";
    String instanceVar1 = "hello from instancevar1";
    static String staticvar= "hello from staticvar";

    void method1() {
        String staticvar1 = "hello from staticvar1";

    }

    void local() {
        String localVar = "hello from local";
        System.out.println(localVar);

    }

    void method2(){
        System.out.println(staticvar);
        System.out.println(instanceVar1);
        System.out.println(instancevar0);

    }

    public static void main(String[] args) {
        Variables obj = new Variables();

        obj.local();
        obj.method2();



    }
}

