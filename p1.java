//create array by taking size from user and print sum of odd elementin array
import java.io.*;

class Demo{
	public static void main(String args[])throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] =new int[size];
		System.out.println("Enter Elements in array:");
		int sum =0;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==1)
				sum=sum+arr[i];
	
		}
		System.out.print("sum of odd number in array is: "+sum);
		
	}
}