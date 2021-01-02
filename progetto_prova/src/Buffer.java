public class Buffer {

    private double[] buff; // buffer, it is shared among threads
    private int size; // size of the buffer
    private int num_elem, head, tail = 0;

    public Buffer (int _size){
        size = _size;
        buff = new double[size];
    }


    /*
    * this is a SYNCHRONIZED methods! This means that this is a critical
    * function because through it we are accessing shared resources (among
    * threads). Each instance has a lock, used to synchronize the access.
    *
    * Synchronized methods are not allowed to be executed concurrently
    * on the same instance.
    * */
    public synchronized void insert (double element){

        /*
        * if number of elements into the buffer is equal to the actual
        * size of the buffer, than we cannot fill it anymore; just wait!
        *
        * here we use "while" because we don't know when the resource will
        * be available, so the thread try and try as long as it won't the access.
        * */
        while(num_elem == size){
            try{ // to catch errors...
                wait();
            }catch (InterruptedException e){
                System.out.println("interrupted");
            }
        }

        // there is space into the buffer, we can insert a new value
        buff[tail] = element;
        tail = (tail + 1) % size;
        num_elem++;
        notify();
    }

    public synchronized double delete (){

        /*
        * if number of elements is equal to zero, it means there are not
        * elements into the buffer, so it is empty; just wait!
        * */
        while(num_elem == 0){
            try{ // to catch errors...
                wait();
            }catch (InterruptedException e){
                System.out.println("interrupted");
            }
        }

        // there is at least one element, we can delete it
        double elem = buff[head];
        head = (head + 1) % size;
        num_elem--;
        notify();
        return elem;
    }
}
