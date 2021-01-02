public class Test_01 {

    int x;
    private static int s;

    public static void setS(int s){
        Test_01.s = s;
    }

    public static int getS(){
        return s;
        // return x+s is not possible 'cause it's a static method,
        // so it can deal with static members
    }

    public static void main(String[] args){

        Test_01 a1 = new Test_01();
        Test_01 a2 = new Test_01();
        a1.x = 1;
        a2.x = 3;
        Test_01.setS(4);

        System.out.println(a2.x);

        Test_02 b = new Test_02();
        b.y = 1;
        b.x = 2;
        // b.s = 3; // we can access static member (now it's private)

        System.out.println(Test_01.getS());
        System.out.println(b.x);
    }
}
