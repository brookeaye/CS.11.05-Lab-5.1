public class ArrayUtility {


    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ", ");
        }
    }


    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum+= array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum+=array[i];
        }
        double average = sum/array.length;
        String averageString = "" + average;
        String finalNum = "";

        for (int i = 0; i < averageString.length(); i++){
            if (averageString.charAt(i) == '.'){
                if (averageString.length()-1 == i+1){
                    finalNum = averageString.substring(0, i+2);
                    break;
                }
                else{
                    finalNum = averageString.substring(0, i+3);
                    break;
                }
            }
            else{
                finalNum = averageString;
            }
        }
        System.out.println(finalNum);
        return Double.parseDouble(finalNum);

    }

    public static int minimum(int[] array) {
        int minimumNum = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < minimumNum){
                minimumNum = array[i];
            }
        }
        return minimumNum;
    }

    public static int maximum(int[] array) {
        int maxNum = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > maxNum){
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]%2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[array.length-1-i];
        }
        return newArray;
    }

    public static void reverseTwo(int[] array) {
        int endNum;
        int firstNum;
        for (int i = 0; i < array.length/2; i++){
            endNum = array[array.length-1-i];
            firstNum = array[i];
            array[i] = endNum;
            array[array.length-1-i] = firstNum;
        }

    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++){
            if (i == array.length-1){
                result+=array[i];
                break;
            }
            result+=array[i] + ", ";
        }
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] + array[j] == num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int lastNum = array[array.length-1];
        for (int i = array.length-1; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = lastNum;
    }

    public static void shiftLeft(int[] array) {
        int firstNum = array[0];
        int lastNum = array[array.length-1];
        array[array.length-1] = firstNum;
        for (int i = 0; i < array.length-2; i++){
            array[i] = array[i+1];
        }
        array[array.length-2] = lastNum;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int firstElement = array[0];
        int[] endArray = new int[n];
        for (int i = 0; i < n; i++){
            endArray[i] = array[array.length-n+i];
        }

        for (int i = array.length-1; i > n; i--){
            array[i] = array[i-n];
        }

        for (int i = 0; i < n; i++){
            array[i] = endArray[i];
        }
        array[n] = firstElement;
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int[] beginningArray = new int[n];
        for (int i = 0; i < n; i++){
            beginningArray[i] = array[i];
        }

        for (int i = 0; i <= array.length-1-n; i++){
            array[i] = array[i+n];
        }

        for (int i = 0; i < n; i++){
            array[array.length-n+i] = beginningArray[i];
        }
    }


}
