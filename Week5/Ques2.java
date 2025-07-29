public class Ques2 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 15, 23, 42};
        int key = 15;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(key + " is in the array.");
        } else {
            System.out.println(key + " is not in the array.");
        }
    }
}
