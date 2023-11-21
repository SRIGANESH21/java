import java.util.Scanner;
class task12{
public static void ain(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter any Number to factorial:");
int num1 = scan.nextInt();
int fact= 1;
for(int i=1;i<=num1;i++){
fact = fact*i;
}
System.out.println("Factorial of a Number is"+fact);
}
}