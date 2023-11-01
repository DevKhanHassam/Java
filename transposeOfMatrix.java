import java.util.*;

class transposeOfMatrix{
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);

        int row=0;
        int col=0;

        System.out.print("Enter no of Rows:");
        row=sc.nextInt();


        System.out.print("Enter no of Columns:");
        col=sc.nextInt();
        
        int [][] mat = new int[row][col];
        int [][] trans = new int[col][row];

        for(int i= 0; i<=(row-1);i++ )
        {
            System.out.println("Enter Row");
            for(int j= 0; j<=(col-1);j++ )
            {   
                
                mat[i][j]=sc.nextInt();
            }
        }


        System.out.println("Your Matrix");

         for(int i= 0; i<=(row-1);i++ )
        {
            
            for(int j= 0; j<=(col-1);j++ )
            {   
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");

        }


        // Transpose

         for(int i= 0; i<=(row-1);i++ )
        {
            
            for(int j= 0; j<=(col-1);j++ )
            {   
                trans[j][i]=mat[i][j];
            }
           
        }


        System.out.println("Your Transpose matrix");

         for(int i= 0; i<=(row-1);i++ )
        {
            
            for(int j= 0; j<=(col-1);j++ )
            {   
                System.out.print(trans[i][j]+" ");
            }

            System.out.println("");
           
        }

    }
}