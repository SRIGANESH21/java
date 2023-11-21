import java.util.Scanner;
class task16{
public static void ain(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter any Number to form Multiplication Table:");
int table = scan.nextInt();
System.out.println("Enter Multiplication Table lengh:");
int count = scan.nextInt();
for(int i=1;i<count;i++)
{
System.out.println(i+" * "+table+"="+(i*table));
}
}
}
