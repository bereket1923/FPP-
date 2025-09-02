package FPP.Ass1;

public class Prog4 {

    public static void main(String[] args) {
        String[] str = {"horse", "dog", "cat", "horse", "dog"};
        String result = ""; // to store unique elements

        for (int i = 0; i < str.length; i++) {
            boolean isDuplicate = false;//Initially, we assume no duplicate

            // Compare str[i] with previous elements str[j]
            for (int j = 0; j < i; j++) {
                if (str[i].equals(str[j])) {
                    isDuplicate = true;// if duplicate found stop inner loop to run
                    break;
                }
            }

            // If not a duplicate, add to the result
            if (!isDuplicate) {
                if (!result.isEmpty()) result += ", ";//if a result not empty, add comma and space
                result += str[i];//add the current element to a new array(result)
            }
        }

        // Print the final array format
        System.out.println("[" + result + "]");
    }
}
