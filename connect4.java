import java.util.*;
class connect
{
  public static void main(String ar[])throws Exception
  {
    Scanner sc=new Scanner(System.in);
    int i=1,r,c,r1,c1,j,k,t=0,cm,rn;
    String win;
    System.out.println("Enter the no. of rows and columns");
    r=sc.nextInt();
    c=sc.nextInt();
    String a[][]=new String[r][c];
    do
    {
      if(i%2!=0)
      {
        System.out.println("address");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        String a[r1][c1]="R";
      }
      else
      {
        System.out.println("address");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        String a[r1][c1]="B";
      }
      for(j=0;j<r;j++)
        {
        for(k=0;k<c;k++)
          {
          System.out.println("a[j][k]"+" ");
          cm=k;
          for(rn=j;rn<r;rn++)
          {
            if(a[rn][cm]==a[rn-1][cm] && a[rn]
            {
              t++;
              String win=a[rn][cm];
              break;
            }
          }
        }
      }
    }while(t<1);
    System.out.println("winner is "+" "win);
  }
}
