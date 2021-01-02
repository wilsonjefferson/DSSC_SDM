import java.util.LinkedList;

public class Stack<E> {

    private LinkedList<E> data;

    Stack(){
        data = new LinkedList<>();
    }

    public void insert(E value){
        data.addFirst(value);
    }

    public E delete(){
        try {
            return data.removeFirst();
        }catch (Exception e){
            System.out.println("ERROR: stack is empty.");
            return null;
        }
    }

    public int size (){
        return data.size();
    }

    /*
    * WILDCARDS ARGUMENTS
    * if we want to compare stacks of the same type, there is no problem to
    * have something like: comparison (Stack<E> Other). But we will have
    * problems if they are of different types, so we may use the special
    * signature '?' as type to infer the type of the other stack and make them
    * comparable.
     * */
    boolean comparison (Stack<?> Other) { // wildcard used!
        return this.size() == Other.size();
    }

    public void print(){

        for(E x : data){
            System.out.print(x + " "); // lifo print style
        }
        System.out.println();
    }

    public static void main (String[] args){

        System.out.println("creating stack");
        Stack<Integer> stack = new Stack<>();

        System.out.println("adding elements");
        stack.insert(1);
        stack.insert(2);
        stack.insert(3);

        System.out.println("stack size: " + stack.size());

        System.out.println("printing data");
        stack.print();

        System.out.println("deleting elements");
        stack.delete();
        stack.delete();

        System.out.println("printing data");
        stack.print();
    }
}
