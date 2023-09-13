import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
    LL list = new LL();
//        list.addfirst(1);
//        list.addfirst(2);
//        list.addfirst(3);
//        list.addfirst(4);

         list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.display();
        list.reverse_rec();
//        list.reverse_iter();
//        list.add_rec(99,2);
//        list.add_at_k(3,9);
//        list.remove_K_elemnet(3);
        System.out.println();
        list.display();
    }

}
