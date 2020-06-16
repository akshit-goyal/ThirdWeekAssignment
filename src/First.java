import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Iterate through Array List
public class First {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<Integer>();
        // adding items to list
        for(Integer item : array){
            list.add(item);
        }
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println("items are "+itr.next());
        }



    }
}
