import java.util.Scanner;
class task20{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the first Number:");
int num = scan.nextInt();
int old = num;
int digit;
int sum = 0;
while(num>0)
{
digit = num%10;
sum = sum +digit;
num = num/10;

}
if(old==sum)
{
System.out.println("it is aArmstrong Number");
}
else
{
System.out.println("it is Not a Armstrong Number");
}
}}