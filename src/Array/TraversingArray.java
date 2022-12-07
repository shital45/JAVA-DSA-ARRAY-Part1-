package Array;

public class TraversingArray {
	
	public static void Loop() {
	//code for one dimentional array	
		
	/*int marks[]={1,2,3,4,5,6,7,8,9};
	
	
	/*for(int mark :marks) {
		System.out.println(mark);
	}*/
	
	/*for(int i=0;i<9;i++) {    <------------here in place of i<9 we can write ArrayName.length
		System.out.println(marks[i]);
	}
	*/
	/*int i=0;
	while(i<9) {
		System.out.println(marks[i]);
		++i;
		
	}*/
	/******************************************/	
		//code for multidimentional array
		
		int [][] digit= {{1,2,3,4},{5,6,7,8}};
		
		for(int i=0;i<digit.length;i++) {
			for(int j=0;j<digit[i].length;j++) {
				System.out.println(digit[i][j]);
			}
		}
		

}}
