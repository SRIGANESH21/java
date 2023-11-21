import java.util.Scanner;
class task4{
public static void ain(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the  rhombus base:");
int base = scan.nextInt();
System.out.println("Enter the rhombus height:");
int height = scan.nextInt();
int area = base * height;
System.out.println("rhombus Area:"+area);
}
}