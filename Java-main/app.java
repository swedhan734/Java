import java.util.Scanner;

public class app {
    public static void main (String[] args){

    // Question 1
    // -------------------------------------
        int list[] = {1,2,3,4,5};
        int i;
        for(i = list.length -1; i>=0; i--){
            System.out.println(list[i]);
        }

        
    }

    // Question 2
    // -------------------------------------
    // Question 3
    // -------------------------------------
    // Question 4
    public int maxnum (int[] nums) {
        int max = nums[0];
        for (int num : nums){
            if(num > max) max = num;
        }
        return max;
    }
    // Question 5
    // -------------------------------------

}