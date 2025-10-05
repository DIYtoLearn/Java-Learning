package Array_Strings;

public class InPlaceArrayUpdater {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 2, 3};
        while (true) {
            // Increment each element
            for (int i = 0; i < arr.length; i++) {
                arr[i]++;
            }
            // Build display string
            StringBuilder sb = new StringBuilder();
            sb.append("Array: ");
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            // Print with carriage return at front to overwrite line
            System.out.print("\r" + sb.toString());
            System.out.flush();

            Thread.sleep(1000); // delay so we can see updates

            // Optional: break condition
            if (arr[0] >= 10) break;
        }
         System.out.println(); // move to next line after loop ends
    }
}
