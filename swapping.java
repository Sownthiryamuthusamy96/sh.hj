import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
int n=Integer.parseInt(br.readLine());
char c[]=new char[n];
char temp;
for(int i=0;i<n;i++
{
temp=c[i];
c[i]=c[i+1];
c[i+1]=temp;
}
System.out.println(c[i]);
}
}
