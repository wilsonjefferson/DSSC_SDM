public class Producer extends Thread {
    Buffer buff;

    Producer (Buffer _buff){
        buff = _buff;
    }

    public void run(){ // override "run" Thread function!
        double value = 0.0;
        while(true){ // infinity loop...
            // call the insert function, don't do that directly
            System.out.println("producer: " + value);
            buff.insert(value);
            value += 0.1;
        }
    }
}
