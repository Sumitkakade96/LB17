import java.util.*;

class MyArray
{
	public int CountVowelArray(char arr1[])
	{
		int icnt=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]=='a' || arr1[i]=='e' || arr1[i]=='i' || arr1[i]=='o' || arr1[i]=='u')
			{
				icnt++;
			}
		}
		return icnt;
	}
}

class assign542
{
	public static void main(String arg[])
	{
		char Arr[]=null;
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int value1=sobj.nextInt();
		
		Arr = new char[value1];
		System.out.println("Enter characters "+value1+" in array");
		for(int i=0;i<value1;i++)
		{
			Arr[i]=sobj.next().charAt(0);
		}
		
		MyArray mobj=new MyArray();
		
		int bret=mobj.CountVowelArray(Arr);
		
		System.out.println("Vowels in array is: "+bret);
		
	}
}