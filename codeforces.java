import java.util.*;
public class codeforces
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long ans=0;
      if(n%2!=0)
      {
          ans=(n-1)/2;
          ans=ans-n;
      }
      else
      ans=n/2 ;

    System.out.println(ans);
    sc.close();
    }
}
