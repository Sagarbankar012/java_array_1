//10 integer array print number divisible by 5 from array
import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		System.out.print("Enter element of array : ");
		for(int i =0; i<10;i++)
			arr[i] = sc.nextInt();
		for(int i=0 ;i<10;i++){
			if(arr[i]%5==0)
				System.out.print(arr[i]+" ");

		}

	}
		
}