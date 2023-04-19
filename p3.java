//create array by taking size from user and print product of odd index in array

import java.io.*;

class Demo{
	public static void main(String args[])throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] =new int[size];
		System.out.println("Enter Elements in array :");
		int product =1;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2==1)
				product=product*arr[i];
	
		}
		System.out.print("Product of odd index is :"+product);
		
	}
}