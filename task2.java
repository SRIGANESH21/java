import java.util.Scanner;
class task2{
public static void ain(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the first Number:");
int num1 = scan.nextInt();
System.out.println("Enter the Second Number:");
int num2 = scan.nextInt();
int add = num1 + num2;
System.out.println("Addition:"+add);
System.out.println("Subtraction:"+num1-num2);
System.out.println("Subtraction:"+num1-num2);
System.out.println("Multiplication:"+num1*num2);
System.out.println("Division:"+num1/num2);
System.out.println("modulus:"+num1%num2);
}
}