import java.util.Scanner;
class BinarySearch
{ public static int binarySearch(int arr[],int l,int r ,int x)
    { if(r>=l)
        { int mid=l+(r-1)/2;
          if(arr[mid]==x)
            return mid;
          if(arr[mid]>x)
            return binarySearch(arr,l,mid-1,x);
          return binarySearch(arr,mid+1,r,x);
        }
        return -1;
    }
    public static void main(String args[])
    { BinarySearch ob=new BinarySearch();
      Scanner b =new Scanner(System.in);
      
      System.out.println("Enter the number of Teams:");
      int n =b.nextInt();
      if(n==0||n<0)
        { System.out.println("Invalid Input");}
      else
          {int a[]=new int[100];
          System.out.println("Enter the score:");
          for(int i=0;i<n;i++)
          { a[i]=b.nextInt();}
          System.out.println("Enter the score to be searched:");
          int x=b.nextInt();
          if(x==0||x<0)
          { System.out.println("Invalid Input");}
          else
              {int result=ob.binarySearch(a,0,n-1,x);
              int r= result+1;
              if(result==-1)
                System.out.println("Score Not Found");
              else
                System.out.println(x+" is the score of Team "+r);}}
        }
}