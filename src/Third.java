import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Third {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        LinkedList<Integer> list  = new LinkedList<Integer>();
        for(Integer item : array) {
            list.add(item);
        }
        Collections.reverse(list);
        ListIterator itr = list.listIterator();
        while(itr.hasNext()){
            System.out.println("Items are "+ itr.next());
        }


    }
}
