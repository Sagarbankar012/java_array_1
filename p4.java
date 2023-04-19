//take array of 7 character and print vowel from array  
import java.io.*;

class Demo{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char arr[] = new char[7];
		System.out.print("Enter 7 character :");
		for(int i=0;i<7;i++){
			arr[i]=(char)br.read();
			br.skip(1);
		}
		for(int i=0;i<7;i++){
			if('a'==arr[i])
				System.out.print("a ");
			else if('e'==arr[i])
				System.out.print("e ");
			else if('i'==arr[i])
				System.out.print("i ");
			else if('o'==arr[i])
				System.out.print("o ");
			else if('u'==arr[i])
				System.out.print("u ");
		}

		
		
	}	
}