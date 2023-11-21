import java.util.Scanner;
class task19{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int a = -1;
int b = 1;
int c = 0;
System.out.println("Enter the Fibonacci Series number : ")
int term = scan.nextInt();
for(int i = 0;i <= term;i++)
{
c = a + b;
a = b;
b = c;
System.out.println(c);
}
}}