package dssc.hello;

public class Main {
    public static void main (String... args){
        if(args.length > 0){
            System.out.println("hello" + args[0] + "!");
        } else {
            System.out.println("hello stranger!");
        }
    }
}
