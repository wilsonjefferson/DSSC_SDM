import java.util.function.Function;
import java.util.function.IntFunction;

public class Lambda{

    public static void main(String[] args){

        // functional interface: (args) -> body
        IntFunction f = (int x) -> x + 1;
        System.out.println(f.apply(2));

        // it is a real interface! We can override it
        IntFunction g = new IntFunction() {
            @Override
            public Object apply(int value) {
                return value + 2;
            }
        };
        System.out.println(g.apply(2));

        // we can use generics
        IntFunction<String> m = (int x) -> "x = " + x;
        System.out.println(m.apply(5));

        // we may also define our own lambda interface...

        // args types are not required (all or no-one)
        // with one args, parenthesis are not required (but we will use them)
        IntFunction f1 = x -> x + 1;
        System.out.println(f1.apply(6));

        Function<Integer, String> f2 = x -> ":" + x + ":";
        System.out.println(f2.apply(2));

        // LambdaInterface it's a class with several functional interfaces
        // created by me.

        // we may define a functional interface with more than one element
        LambdaInterface.DoubleDoubleFunction<Double> f4 = (x, y) -> x + y;
        System.out.println(f4.apply(2.1, 2.2));

        // also as generic!
        LambdaInterface.IntIntFunction<Integer> f3 = (x, y) -> x + y;
        System.out.println(f3.apply(2, 3));

        // we may also capture "external" variables
        double var = 2.0; // it is a final variable, cannot be modified!
        LambdaInterface.IntIntFunction<Double> f5 = (x, y) -> x + var + y;
        System.out.println(f5.apply(2.1, 3.1));


    }
}

