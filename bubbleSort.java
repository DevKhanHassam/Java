import java.util.*;

public class check{
    public static void main(String args[])
    {
   
      
        int [] num={5,4,3,3,2,1};


        for(int i=0;i<num.length;i++)
        {
            for(int j=0; j<(num.length-i-1);j++)
        {
            if(num[j]>num[j+1])
            {
                int temp = num[j];
                num[j]=num[j+1];
                num[j+1]=temp;
            }

            
        }   
        }
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+",");
        }
    }
}
