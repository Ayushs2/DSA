public class Basic {
    public static void main(String[] args) {
        //***************************************
        // Last In First Out - LIFO
        //***FUNCTIONS*****
        // top - index of top element of stack
        //size
        // peek -  display the top element from stack
        // push - adding elements to stack
        // pop - removing top element from stack
        // isEmpty - whether stack is empty or not
        // Only accessible element is top

        int a[] = new int[10];
        int top = -1;
        for (int i = 0; i < 10; i++) {
            a[++top] = i;
        }
        System.out.println(a[top]);
        top--;//or --top
        System.out.println(a[top]);
        /*
        ***************************************
        Queue - only accessible element is front of queue
        * FIFO -> First in first out
        functions
        * front -> index of front element of queue
        * end -> index of end element of Queue
        * push -> adding element at end
        * pop -> removing elements form front
        * isempty -> whether Queue is empty
         */
        int b[] = new int[100];
        int front = -1;
        int end = -1;
        //Entering elements in an Queue
        for (int i = 0; i < 10; i++) {
            a[++end] = i;
            if (front == -1){
                front=end;
            }
        }
        //pop element form Queue
        for (int i = 0; i < 5; i++) {
            if (front==-1){
                System.out.println("Queue is empty");
                break;
            }
            if (front ==end){
                front=-1;
            }
            else
            front++;
        }
        if(front==-1){
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println(a[front]);
        }


    }
}
