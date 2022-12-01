package geekforgeeksproblems;

public class Test {


    static int maxSum(int arr[], int n, int k) {
        int max_sum = 0;

        for(int i=0; i < n - 1; i++) {
            int curr_sum = 0;
            for(int j=0; j < k; j++) {
                curr_sum += arr[i + j];
            }
            max_sum = Math.max(curr_sum,max_sum);
        }

        System.out.println("Max Sum" + max_sum);
        return max_sum;
    }

    //Given an array of integers of size ‘n’.
    //Our aim is to calculate the maximum sum of ‘k’
    //consecutive elements in the array.

    public static void main(String args[]) {
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
