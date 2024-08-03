import java.util.Scanner;
public class practical2_2
{
public static void main(String[] args)
{
int count=0;
System.out.println("Enter array size");
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int [] arr= new int[n];
System.out.println("Enter the numbers");
for(int i=0; i<n; i++)
{
arr[i]=sc.nextInt();
}
for(int i=0; i<n; i++)
{ 
if(arr[i]==9)
{
count++;
}

}
System.out.println("The number of times 9 is repeated is " +count);
System.out.println("This practical is made by 23CS046-Kathan Modh");
sc.close();

}
}