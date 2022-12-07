package Array;

public class ArrayEx2 {
	
public static void MaxNum() {
	
	int arr[]= {5,3,6,2,8,4};
	int ans=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>ans) {
			ans=arr[i];
		}
		
	}
	System.out.println("max num is  "+ans);

	
	
	
	
	
}

}
