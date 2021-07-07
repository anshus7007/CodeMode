import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c,n;
        r=sc.nextInt();
        c=sc.nextInt();
        n=sc.nextInt();

        String s[]=new String[r];
        for(int i=0;i<r;i++)
        {

                s[i]=sc.next();


        }
        char a[][]=new char[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<s[i].length();j++)
            a[i][j]=s[i].charAt(j);


        }
        char[][] ans=hehe(a,r,c);
        char[][] res=hehe(ans,r,c);
//        for(int i=0;i<r;i++)
//        {
//            for(int j=0;j<c;j++)
//            {
//                System.out.print(a[i][j]);
//            }
//            System.out.println();
//        }
        if(n%2==0)
        {

            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print("0");
                }
                System.out.println();
            }
        }
        if(n%4==3)
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
        }
        if(n%4==1)
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(res[i][j]);
                }
                System.out.println();
            }
        }
    }
     static char[][] hehe(char [][] a, int r, int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]=='0')
                {
                    if(i-1>=0)
                        a[i-1][j]='*';
                    if(i+1<r)
                        a[i+1][j]='*';
                    if(j-1>=0)
                        a[i][j-1]='*';
                    if(j+1<c)
                        a[i][j+1]='*';
                    a[i][j]='*';
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {

                if(a[i][j]=='.')
                {
                    a[i][j]='0';

                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]=='*')
                {
                    a[i][j]='.';
                }

            }
        }
        return a;
    }
}
