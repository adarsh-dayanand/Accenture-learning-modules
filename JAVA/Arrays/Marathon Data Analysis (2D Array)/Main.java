import java.util.*;
import java.text.DecimalFormat;

public class Main{
    
       static double[][] arr2D = new double[4][7];
       static String[] names = {"David","Charles","Antony","Leo"};
       static double sum=0,sum1=0,sum2=0,sum3=0;
       static double avg=0,avg1=0,avg2=0,avg3=0,avg4=0,avg5=0,avg6=0;
       
       public static void main(String[] args){
            
            Scanner sc = new Scanner(System.in);
            Main obj = new Main();
            
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<7;j++)
                {
                    arr2D[i][j]=sc.nextDouble();
                }
            }
            
            System.out.println("Total Distance covered by each participant:");
            obj.totalDis();
            obj.avgDis();
            obj.display();
       }
       
       void avgDis()
       {
           int flag1=0,j;
           
           for(int i=0;i<7;i++)
           {
               for(j=0;j<4;j++)
               {
                   if(flag1==0)
                       avg+=arr2D[j][i];
                   if(flag1==1)
                        avg1+=arr2D[j][i];
                    if(flag1==2)
                        avg2+=arr2D[j][i];
                    if(flag1==3)
                        avg3+=arr2D[j][i];
                    if(flag1==4)
                        avg4+=arr2D[j][i];
                    if(flag1==5)
                        avg5+=arr2D[j][i];
                    if(flag1==6)
                        avg6+=arr2D[j][i];
               }
               flag1++;
           }
       }
       
       void totalDis()
       {
           int flag=0,j;
           
           for(int i=0;i<4;i++)
           {
               for(j=0;j<7;j++)
               {
                   if(flag==0)
                        sum=sum+arr2D[i][j];
                    if(flag==1)
                        sum1=sum1+arr2D[i][j];
                    if(flag==2)
                        sum2=sum2+arr2D[i][j];
                    if(flag==3)
                        sum3=sum3+arr2D[i][j];
               }
               flag++;
           }
       }
       
       void display()
       {
           int i=0;
         
           System.out.println(names[i++]+" "+(new DecimalFormat("0.00").format(sum))+" kms");
           System.out.println(names[i++]+" "+(new DecimalFormat("0.00").format(sum1))+" kms");
           System.out.println(names[i++]+" "+(new DecimalFormat("0.00").format(sum2))+" kms");
           System.out.println(names[i]+" "+(new DecimalFormat("0.00").format(sum3))+" kms");
           
           System.out.println("Average distance covered on each day:");
           int j=4;
           i=0;
           while(i!=7)
           {
               System.out.println("Day1:"+(new DecimalFormat("0.00").format(avg/j))+" kms");
               i++;
               System.out.println("Day2:"+(new DecimalFormat("0.00").format(avg1/j))+" kms");
               i++;
               System.out.println("Day3:"+(new DecimalFormat("0.00").format(avg2/j))+" kms");
               i++;
               System.out.println("Day4:"+(new DecimalFormat("0.00").format(avg3/j))+" kms");
               i++;
               System.out.println("Day5:"+(new DecimalFormat("0.00").format(avg4/j))+" kms");
               i++;
               System.out.println("Day6:"+(new DecimalFormat("0.00").format(avg5/j))+" kms");
               i++;
               System.out.println("Day7:"+(new DecimalFormat("0.00").format(avg6/j))+" kms");
               i++;
           }
       }
}













