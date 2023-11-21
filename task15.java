import java.util.Scanner;
class task15{
public static void ain(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter any one Number:");
int num1 = scan.nextInt();
if(num1==0)
{
System.out.println("The Given number is Zero");
}else if(num1<0)
{
System.out.println("The Given number is Negative");
}else 
{
System.out.println("The Given number is Positive");
}
}
}
