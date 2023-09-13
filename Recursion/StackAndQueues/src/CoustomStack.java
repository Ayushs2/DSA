public class CoustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE =10;
    int ptr =-1;
    public CoustomStack(){
        this(DEFAULT_SIZE);
    }

    public CoustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Stack is Full!!");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty!!");
        }

        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()) {
            throw new Exception("Cannot peek from empty Stack");
        }
            return data[ptr];

    }

    private boolean isFull() {
        if(ptr==data.length){
            return true;
        }
        return false;
    }
    private boolean isEmpty() {
        if(ptr==-1){
            return true;
        }
        return false;
    }
}
