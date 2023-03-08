package num;

public class num {

	public static void main(String[] args) {
		int arr[]= {4,-4,6,8,-9,0,4,-7,56};
		int cp=0,cn=0;
		int l=arr.length;
		for (int i=0;i<l;i++)
		{
			if(arr[i]<0) {
				cn++;
			}
			else if(arr[i]>0) {
				cp++;
			}
			
		}
		System.out.println("Count of -ve numbers: "+cn);
		System.out.println("Count of +ve numbers: "+cp);
	}

}
