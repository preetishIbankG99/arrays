package september;

public class ReturnArray {
	//creating method which returns an array
	static int[]get(){
		return new int[] {10,20,30,40};
	}
	
	
	

	public static void main(String[] args) {
		//calling method which return an array
		int arr[]=get();
		
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
	}

}
