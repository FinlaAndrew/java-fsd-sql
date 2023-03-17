package practiseQ;
import java.util.*;

public class Linkedlist {
	    public static void main(String[] args) {
	       
	        LinkedList<Integer> list = new LinkedList<>();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	        
	        int k = 3; 
	        
	        
	        Integer[] arr = list.toArray(new Integer[list.size()]);
	        Arrays.sort(arr, Comparator.reverseOrder());
	        
	        
	        int kthLargest = arr[k-1];
	        
	        System.out.println("Kth largest element: " + kthLargest);
	    }
	}


