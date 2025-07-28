
public class Array7.java {
    public static void main(String[] args) {
        int[] Array1 = {10, 20, 30, 40, 50}; 

       
        int[] Array2 = new int[Array1.length];

        
        for (int i = 0; i < Array1.length; i++) {
           Array2[i] = Array1[i];
        }

        
        for (int i = 0; i < Array2.length; i++) {
            System.out.print(Array2[i] + " ");
        }
    }
}