package array.workings;

public class Second_smallest {
	public static void main(String[] args)
	{
	int[] nums = { 6,4, 0,9,-5 ,11, 1,7,4, 10 };

    int max =Integer.MAX_VALUE;
    int secmax =Integer.MAX_VALUE;

    for(int x=0; x<nums.length; x++) {
        if(nums[x]<max ) {
            secmax = max;
            max=nums[x];
        }else if(nums[x]<secmax){
            secmax=nums[x];
        }
     }
    System.out.println("1st Smallest value: " + max);
    System.out.println("2nd smallest Value: " + secmax);
}

}
