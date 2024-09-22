import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int[] nums = new int [10];
    for (int i=0; i<nums.length; i++) {
      int termnumber = i+1;
      System.out.println("Enter the term number " + termnumber);
      nums[i] = in.nextInt();
    }

    System.out.println("The first number is: " + nums[0]);
    System.out.println("The last number is: " + nums[nums.length-1]);
    PrintMyArray(nums);
    System.out.println("\nThe average is: " + ArrayAverage(nums));
  }

  public static void PrintMyArray(int[] nums) {
    for(int i=0; i<nums.length; i++) 
      System.out.print(nums[i] + " ");

  }  
  public static int ArrayAverage(int[] nums) {
    int sum=0;
    for(int i=0; i<nums.length; i++) { 
    sum +=nums[i];
    }  
    return sum/nums.length;
  }

}