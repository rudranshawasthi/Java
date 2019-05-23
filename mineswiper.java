import java.io.*;
class mineswiper
{
public static void main(String at[])throws Exception
{
DataInputStream z=new DataInputStream(System.in);
int i,j,r,c,nom;
System.out.print("dimentions");
r=Integer.parseInt(z.readLine());
c=Integer.parseInt(z.readLine());
System.out.print("no of mines");
nom=Integer.parseInt(z.readLine());
int A[][]=new int[r][c];
int B[][]=new int[r][c];
int b=0,o=0;
for(i=0;i<r;i++)
{
 for(j=0;j<c;j++)
 {
  A[i][j]=0;
 }
}
for(i=0;i<r;i++)
{
 for(j=0;j<c;j++)
 {
  B[i][j]=0;
 }
}

for(i=0;i<nom;i++)
{
 System.out.print("place of bom");
 b=Integer.parseInt(z.readLine());
 o=Integer.parseInt(z.readLine());
 A[b-1][o-1]=9;
}
for(i=0;i<r;i++)
{
 for(j=0;j<c;j++)
 {
  if(A[i][j]>=9)
  {
   try
   {
    A[i+1][j-1]++;
   }
   catch(Exception h)
   {
   }
   try
   {
    A[i+1][j]++;
   }
   catch(Exception e)
   {
   }
   try
   {
    A[i+1][j+1]++;
   }
   catch(Exception s)
   {
   }
   try
   {
    A[i][j-1]++;
   }
   catch(Exception t)
   {
   }
   try
   {
    A[i][j+1]++;
   }
   catch(Exception u)
   {
   }
   try
   {
    A[i-1][j]++;
   }
   catch(Exception v)
   {
   }
   try
   {
    A[i-1][j+1]++;
   }
   catch(Exception w)
   {
   }
   try
   {
    A[i-1][j-1]++;
   }
   catch(Exception q)
   {
   }

  }
 }
}
int ch=0,x=0,p=0;
do
{
 for(i=0;i<r;i++)
 {
  for(j=0;j<c;j++)
  {
   System.out.print(B[i][j]+"    ");
  }
  System.out.println();
 }
 System.out.println("1-play");
 System.out.println("2-flag");
 System.out.println("3-doubt");
 System.out.println("4-exit");
 ch=Integer.parseInt(z.readLine());
 if(ch!=4)
 {
  System.out.println("inter position");
  b=Integer.parseInt(z.readLine());
  o=Integer.parseInt(z.readLine());
  b--;
  o--;
 }
 if(ch==1)
 {
  if(A[b][o]>=9)
  {
   ch=4;
  }
  if(A[b][o]<9)
   B[b][o]=A[b][o];
 }
 if(ch==2)
 {
  if(A[b][o]>=9)
  {
   p++;
   B[b][o]=8;
  }
  if(A[b][o]<9)
   B[b][o]=1;
 }
 if(ch==3)
 {
  if(A[b][o]>=9)
  {
   B[b][o]=7;
  }
  if(A[b][o]<9)
   B[b][o]=7;
 }
 for(i=0;i<r;i++)
 {
  for(j=0;j<c;j++)
  {
   if(A[i][j]>=9&B[i][j]==8)
   x++;   
  }
 } 
b=0;
o=0;
}
while(ch!=4);
if(x==nom)
 System.out.print("  YOU WON   ");
System.out.print("points"+p);
}
}
