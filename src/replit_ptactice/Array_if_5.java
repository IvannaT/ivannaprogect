package replit_ptactice;

public class Array_if_5 {
    public static void main(String[] args) {
        int[]nums ={1,2,5,5,6};
        for(int i =0;i <nums.length-1;i++){
            if(nums[i]== 5 && nums[i+1]== 5){
                System.out.println(true);
                return;
            }
        }

                System.out.println(false);


    }
}
