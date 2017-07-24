import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLIne();
int revnum=0;
for(i=0;i<n;i++)
{
revnum=revnum*10;
revnum=revnum+n%10;
n=n/10;
}
System.out.println("the reverse numb is:"+revnum);
}
}
