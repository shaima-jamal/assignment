import java.util.*;

public class shaima{

	public static void main(String[]args){

	Scanner t=new Scanner(System.in);
	System.out.println("Please Enter Number Of Your Name Is Latter");

	int aa=t.nextInt();
	char myName[]=new char[aa];

	System.out.println("Enter The Letters");


	for(int i=0;i<myName.length;i++)
	{
	myName[i]=t.next().charAt(0);
}

System.out.print("Your Name Is: ");

for(int i=0;i<myName.length;i++)

{
	System.out.print(myName[i]);
}
System.out.println("");
}}