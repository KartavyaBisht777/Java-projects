public class Array4
{

     public static void main (String []args)
    {
 
    int [] values = { 45,76,56,90 };
    int min = 0;
    for(int elements : values )
    {
        if ( elements < min )
    {
        min = elements;
    }
    }
    System.out.print(min);
}
}
    
