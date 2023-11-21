import java.util.Scanner;
class task14{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the hour:");
int prime = scan.nextInt();
int count = 0;
for(int i=1;i<=prime;i++)
{
if(prime%i==0)
{
count++;
}
}
if(count===2){
System.out.println(prime +"is a Prime Number");
}
else
{
System.out.println(prime +"is  Not a Prime Number");
}
}
}