import java.util.Scanner;

public class MergeSort {
    public static void merge(int nums[], int start, int mid, int end){
        int temp[] = new int[end-start+1];
        int left = start;
        int right = mid+1;
        int index = 0;
        while(left<=mid && right<=end){
            if(nums[left]<nums[right]) temp[index++] = nums[left++];
            else temp[index++] = nums[right++];
        }
        while(left<=mid) temp[index++] = nums[left++];
        while(right<=end) temp[index++] = nums[right++];
         index = 0;
        while(start<=end) nums[start++] = temp[index++];
        
        
    }
    public static void mergeSort(int nums[], int start, int end){
        if(start==end) return;
        int mid = start+(end-start)/2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);
        merge(nums,start, mid, end);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, arr.length-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
