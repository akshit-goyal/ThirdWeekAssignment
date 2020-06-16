import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Second {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int elementToBeReplaced = 3;
        int replaceItem =6;
        int index = list.indexOf(elementToBeReplaced);
        list.set(index,replaceItem);
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println("Elements are "+ itr.next());
        }

    }
}
