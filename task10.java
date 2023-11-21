class task10{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int sum = 0,count = 0;
for(int j=1;j<=100;j++)
{
for(int i=1;i<j;i++)
{
if(j%i==0)
{
count++;
}
}
if(count==2)
{
sum = sum+j;
}
}
}
}
