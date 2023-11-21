import java.util.Scanner;
class task1{
public static void ain(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the first Number:");
int num1 = scan.nextInt();
System.out.println("Enter the Second Number:");
int num2 = scan.nextInt();
System.out.println("before Swapping:");
System.out.println("First:"+num1);
System.out.println("Second:"+num2);
int temp;
temp = num1;
num1 = num2;
num2 = temp;
System.out.println("After Swapping:");
System.out.println("First:"+num1);
System.out.println("Second:"+num2);
}
}

