import java.util.*;

class faboInRecu{


    public static void printfab(int fElement, int sElement, int End )
    {   
        if(End==0)
        {
            return;
        }
        
        int c=fElement+sElement;
        System.out.print(c);

        printfab(sElement,c,End-1);
    }
    public static void main(String args[])
    {

        System.out.print(0);
        System.out.print(1);
        printfab(0,1,5);
        
    }
    
}