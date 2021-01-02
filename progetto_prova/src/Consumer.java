public class Consumer extends Thread{

    Buffer buff;

    Consumer(Buffer _buff){
        buff = _buff;
    }

    public void run(){ // override "run" Thread function!
        while(true){ // infinity loop...
            // call the delete function, don't do that directly
            double value = buff.delete();
            System.out.println("consumer: " + value);
        }
    }
}
