class task9{
public static void ain(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the hour:");
int hour = scan.nextInt();
int min = hour*60;
int sec = hour*3600;
System.out.println("for a given hour : "+hour);
System.out.println("Equals to: "+ min +"minutes");
System.out.println("Equals to: "+ sec +"Seconds");
}
}