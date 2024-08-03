import java.util.Scanner;
public class practical2_1
{
public static void main(String[] args)
{
System.out.println("Enter the string");
Scanner sc= new Scanner(System.in);
String str=sc.nextLine();


if(str.length()>3)
{
System.out.println("Enter the number of times you want to repeat");
int n=sc.nextInt();
System.out.print("\'");
for(int i=0; i<n ;i++)
{
System.out.print(str.substring(0,3));
}
System.out.print("\'");
}
else
{
System.out.println(str);
}
System.out.println("\nThis practical is made by 23CS046-Kathan Modh");
sc.close();
}

}