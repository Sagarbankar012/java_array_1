//create array by taking size from user and print product of even elementin array
import java.io.*;

class Demo{
	public static void main(String args[])throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] =new int[size];
		System.out.println("Enter Elements in array :");
		int Product =1;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0)
				Product=Product*arr[i];
	
		}
		System.out.print("sum of odd number in array is :"+Product);
		
	}
}