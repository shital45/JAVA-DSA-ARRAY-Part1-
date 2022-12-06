package Array;
/*Array is an object.
 * int [] height;---->height=new int[5];
 * int []ages=new ages[7];
 * int ages[]={1,2,3};
*/
public class BasicArray {
	
	public static void demoarray() {
		int ages[];
		ages=new int[5];
		System.out.println(ages[0]=23);
		ages[0]=23;
		ages[1]=34;
		ages[2]=45;
		ages[3]=47;
		ages[4]=78;
		System.out.println(ages[5]);/* this line will create arrat out of bound exception */
	}

	public static void main(String[] args) {
		demoarray();
	}

}
