import java.util.*;
class large
{
  public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("number is");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b&&a>c)
    {
      System.out.println("a is greater "+a);
    }
    else if(b>c)
    {
      System.out.println("b is greater "+b);
    }
    else
     {
       System.out.println("c is greater "+c); 
     }
  }
}
