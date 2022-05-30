public class Largest {
    public static void main(String[] args) {
        int[] num={6,2,8,4,5};
        int max=num[0];
        for (int i=0;i< num.length;i++){
            if (num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Largest number of array is = "+max);
    }
}
