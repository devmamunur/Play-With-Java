
// Find how many even digit are available in array;
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {0, 0, 11, 234, -22, 4, -4566};

        System.out.println(findNumbers(nums));
    }
    static  int findNumbers (int[] nums){
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            num = 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
        return count % 2 == 0;
    }
}
