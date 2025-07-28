public class Array3 
{

     public static void main (String []args)
    {
 
    int [] values = { 45,76,56,90 };
    int max = 0;
    for(int elements : values )
    {
        if ( elements > max )
    {
        max = elements;
    }
    }
    System.out.print(max);
}
}