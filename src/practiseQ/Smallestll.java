package practiseQ;
import java.util.*;
import java.util.stream.*;
public class Smallestll {

		    public static List<Integer> findKthSmallest(LinkedList<Integer> list, int k) {
		        return list.stream()
		                   .sorted()
		                   .limit(k)
		                   .collect(Collectors.toList());
		    }

		    public static void main(String[] args) {
		        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		        System.out.println(list);
		        int k = 3;
		        List<Integer> kLargest = findKthSmallest(list, k);
		        System.out.println(kLargest.get(k-1));
		    }


	}


