public class Add {

    public static void main(String args[]){
         int number = 1234;
         int sum = 0;
         
         do {
            int digit = number % 10;
            number = number / 10;
            sum = sum + digit;
         }
        while (number > 0);
         System.out.println(sum);

    }

    
    
}
