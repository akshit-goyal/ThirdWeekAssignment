import java.util.HashSet;

// converting HashSet to an array
public class Fourth {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5};
        HashSet<Integer> set= new HashSet<>();
        for(Integer item :array){
            set.add(item);
        }
        //resultant array
        Object[] convertedArray = set.toArray();
        for (Object obj: convertedArray) {
            System.out.println("Elements are " +(Integer)obj);
        }
    }
}
