//date 7-12-2022
package Array;
/* There are two types of array --1)single dimentional and 2)multidimentional array */

/* multidementional array is array of arrays 
 * */
public class BasicArray1 {
	
		
	
	
	public static void demoarray1() {
		System.out.println("i am demoarray1 method ");
		int [][] age=new int [4][3];//this array will create 4*3=12 elements so 12*4(size of int)=48 bytes space will be taken 
		age[1][1]=11;
		age[1][2]=12;
		age[0][1]=01;
		
		//age[1][3]=3;
		//age[1][4]=4;
		//age[1][5]=5;                                        //array out of bound exception for commented lines
		//System.out.println(age[1][5]);
		
		System.out.println(age[3][0]);//suppose we have not declared anything then we get 0.
		System.out.println(age[1][2]);
		System.out.println("the length of age array is " +age.length);
		
		
	}
	
	public static void multidimentionalArray(){
		System.out.println("i am multidimentional array ");
		int [][] digits= {{1,2,3,4},{5,6,7,8}};
		
		          System.out.println(digits[1][1]);
		          System.out.println("the length of digits array is "+digits.length);
	}

}
