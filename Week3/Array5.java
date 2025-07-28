public class Array5 
{

 public static void main (String []args)
 {
     boolean isSorted = true;
    int [] values = { 45,76,56,90 }; 
    for (int i=0;i<3;i++)
    {
        if(values[i] > values[i+1] )
        {
            isSorted = false;
            break;
        }
    }

     if(isSorted){
        System.out.println("The Array is sorted");
     }
     else{
        System.out.println("The Array is not sorted");
     }
}

      
   












    
}
