public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] num = {1, 6, 8, 4, 9};
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Second largest number in the array is  "+num[num.length-2]);

    }

}
