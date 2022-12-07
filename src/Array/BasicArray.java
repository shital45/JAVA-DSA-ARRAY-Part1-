//Date-7-12-2022

package Array;
/*Array is an object.
 * int [] height;---->height=new int[5];
 * int []ages=new ages[7];
 * int ages[]={1,2,3};
 
*/
public class BasicArray {
	
	public static void demoarray() {
		
		System.out.println("i am demoarray method ");
		int ages[];
		ages=new int[5];
		System.out.println(ages[0]=23);
		ages[0]=23;
		ages[1]=34;
		ages[2]=45;
		ages[3]=47;
		ages[4]=78;
	}
		//System.out.println(ages[5]);/* this line will create array out of bound exception */
		/*System.out.println(ages[-3]);<----------this line will create array out of bound exception	*/

	public static void main(String[] args) {
		demoarray();//we can call this method without writing class name because it is in same class
		System.out.println("********************");
		
		BasicArray1.demoarray1();//we have to call this by writing class name because it is in another class.
		System.out.println("********************");
		
		BasicArray1.multidimentionalArray();
		System.out.println("*************");
		TraversingArray.Loop();
		ArrayEx1.SumOfArray();
		System.out.println("****************");
	    ArrayEx2.MaxNum();
	    System.out.println("**************");
	    ArrEx3.NumCheck();
	}

}
