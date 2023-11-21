import java.util.Scanner;
class task1{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the first Number:");
int num1 = scan.nextInt();
System.out.println("Enter the Second Number:");
int num2 = scan.nextInt();
int product;
product = num1 * num2;
System.out.println("Product of two Number is:"+product);
}
}