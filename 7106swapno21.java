import java.util.Arrays;

public class swapno{
    public static void main(String[] args)
    {
        int[] array_nums={20,30,34,12,10};
        System.out.println("Original Array:" +Arrays.toString(array_nums));
        int x=array_nums[0];
        array_nums[0]=array_nums[array_nums.length - 1];
        array_nums[array_nums.length - 1]=x;
        System.out.println("NEW ELEMENT AFTER SWPPING HT E FIRST AND LAST ELEMENT IS 
        :" +Arrays.toString(array_nums));


    }
}