public class Smallest {
    public static void main(String[] args) {
        int[] num={6,2,8,0,4,5};
        int min=num[0];
        for (int i=0;i< num.length;i++){
            if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Smallest number of array is = "+min);
    }
}
