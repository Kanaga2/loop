# loop
import java.io.*;
import java.util.*;
public class Loop
{
public static void main(String args[])
{
int n=10,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println("The sum of "+n+" numbers is:"+sum);
}
}
