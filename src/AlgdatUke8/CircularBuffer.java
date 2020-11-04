package AlgdatUke8;

public class CircularBuffer {
    char[] buffer;
    int head;
    int tail ;
    int size = 0;
    int count;


    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(6);

        char[] values = "ABCDEFGHIJKLMNOPQRSTUVW".toCharArray();
        for (int i = 0; i < values.length; ) {
            for (int j = 0; j < 5; ++j) {
                if( values.length > i+j){
                    buffer.pushBack(values[i+j]);
                }

            }
            while(buffer.count() > 0){
                System.out.print(buffer.popFront());
            }
            System.out.println();
            i = i+5;


        }

    }
    CircularBuffer(int size){
        this.buffer = new char[size];
        this.size = size;
        this.head= 0;
        this.tail = 0;
        this.count = 0;
    }
    void pushBack(char value){
        if(count +1 > size){
            throw new IndexOutOfBoundsException();
        }
        buffer[tail] = value;
        tail = (tail + 1) % size ;
        count = count +1;


    }
    char popFront(){
        if(count <= 0){
            throw new IndexOutOfBoundsException();
        }
        char retval = buffer[head];
       // System.out.print(head);
        head = ( head+ 1) % size;
        count = count -1;
        return retval;

    }
    int count(){
        return count;
    }
}
