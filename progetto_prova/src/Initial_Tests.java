public class Initial_Tests {

    public static void main(String[] args){
        hello_world();
        arithmetic();
        boolean_method();
        casting();
        if_else();
        arrays();
        add(1, 2, 3);
    }

    public static void hello_world(){
        String p1 = "Hello World";
        String p2 = "I'm Here!";
        System.out.println("method hello_world");
        System.out.println(p1 + ", " + p2);
        System.out.println();
    }

    public static void arithmetic(){
        int a = 5;
        int c = 10;

        System.out.println("method arithmetic");
        System.out.println("a = " + a);

        System.out.println("++c = " + ++c);
        System.out.println("c++ = " + c++);

        System.out.println("c = " + c);
        System.out.println();
    }

    public static void boolean_method(){
        int x = 3;
        int y = 2;
        boolean variable = x < y;

        System.out.println("method booleean");
        System.out.println(x < y);
        System.out.println("variable = " + variable);
        System.out.println();
    }

    public static void casting(){
        int a = 4;
        int b = 'x';
        double c = 3.0215F;
        long d = 10;

        int e = (int)d;

        System.out.println("method casting");
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("e = " + e);
        System.out.println();
    }

    public static void if_else(){
        char c = 'x';

        System.out.println("method i_else");
        if(c >= 'a' || c <= 'f')
            System.out.println("true");
        else
            System.out.println("false");
        System.out.println();
    }

    public static void arrays(){
        int[] a;
        a = new int[]{1, 2, 3, 4};

        int[] b = {1, 2, 3, 4, 5};

        int[] c;
        c = new int[3];
        c = new int[]{1, 2, 3}; // overwriting...

        System.out.println("method arrays");
        System.out.println("a = " + a);
        System.out.println(a.length);

        for(int x : b) System.out.print(x +  " "); // for-each: x = b[*]
        System.out.println();
    }

    public static void add(int... values){ // encaps input values
        int sum = 0;
        for(int x : values) sum += x;

        System.out.println("method add");
        System.out.println("sum = " + sum);
        System.out.println();
    }
}
