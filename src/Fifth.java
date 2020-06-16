import java.util.*;

// compare elements of two sets
public class Fifth {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(2,3,4,6,7));
        set1.retainAll(set2);
        Iterator itr = set1.iterator();
        while(itr.hasNext()){
            System.out.println("retained Elements are "+ itr.next());
        }
    }


}
