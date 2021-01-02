public class Test_Exception_01 {

    public static void main (String[] args){
        String s = "Hello";
        try{
            System.out.println(s.charAt(10));
        }catch(StringIndexOutOfBoundsException e){ // out bound
            System.out.println("Error: something went wrong.");
            System.out.println(e.toString()); // StringIndexOutOfBoundsException
        }
    }

    public static void printfInfo(String sentence){

        try{ // try to do
            char first = sentence.charAt(0);
            char last = sentence.charAt(sentence.indexOf('.') - 1);
            String out = String.format("First: %c Last: %c", first, last);
            System.out.println(out);
        }catch(StringIndexOutOfBoundsException e1){ // less general...
            System.out.println("wrong sentence, no dot?");
        }catch (NullPointerException e2){ // more general...
            System.out.println("no valid string.");
        }finally{ // in case try goes well
            System.out.println("done!");
        }




    }
}
