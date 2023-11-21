import java.util.Scanner;
class task18{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Calculator");

System.out.println("Enter the First Number:")
int num1 = scan.nextInt();
System.out.println("Enter the Second Number:")
int num2 = scan.nextInt();

int total;
do{
System.out.println("1.Addition");
System.out.println("2.Subtrction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("5.Modulus");
System.out.println("Enter the choice which opertion to perform(Enter 1 to 5)");
int choice = scan.nextInt();
switch(choice){
case 1: 
	 total = num1+num2;
	System.out.println(total);
	break; 
case 2: 
	 total = num1-num2;
System.out.println(total);

	break; 
case 3: 
	 total = num1*num2;
System.out.println(total);
	break; 
case 4: 
	 total = num1/num2;
System.out.println(total);
	break; 
case 5: 
	 total = num1%num2;
System.out.println(total);
	break; 
default: 
	System.out.println("Enter the valid option from above");
}
System.out.println("Do u want perfrom another operation:(Type yes or no ):")
String opt = scan.nextLine();
}

while(opt=="yes");