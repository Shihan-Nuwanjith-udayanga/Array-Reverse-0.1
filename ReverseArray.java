import java.util.*;
class ReverseArray{
	public static void main(String args[]){
		int[] x={10,55,33,4,5,23,87,65,45,98};
		System.out.println(Arrays.toString(x));
		reverse(x);
		System.out.println(Arrays.toString(x));
	}
	public static void reverse(int[] x){
		/*int i=0, j=x.length-1;
		while(i<j){
			int t=x[i];
			x[i]=x[j];
			x[j]=t;
			System.out.println(i+" "+j);
			i++; j--;
		}*/
		for(int i=0,j=x.length-1; i<j; i++, j--){
			int t=x[i];
			x[i]=x[j];
			x[j]=t;
		}
	}
}
