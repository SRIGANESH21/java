import java.util.Scanner;
class task3{
public static void ain(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the 5 Numbers:");
int num1 = scan.nextInt();
int num2 = scan.nextInt();
int num3 = scan.nextInt();
int num4 = scan.nextInt();
int num5 = scan.nextInt();
int Average = (num1+num2+num3+num4+num5)/5;
System.out.println("Average:"+Average);
}
}