public class MainProducerConsumer {

    public static void main(String[] args){

        Buffer buff = new Buffer(10);
        Producer prod = new Producer(buff);
        Consumer cons = new Consumer(buff);

        System.out.println("Buffer, Producer and Consumer created!");

        prod.start(); // use start Thread function and not run function!
        cons.start(); // use start Thread function and not run function!
    }
}
