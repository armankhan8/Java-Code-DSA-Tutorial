package DSA.Recursion;

public class isSorted {
    public static boolean isSort(int arr[], int ind){
        if(ind == arr.length-1){
            return true;
        }
        if(arr[ind] < arr[ind+1]){
            return isSort(arr, ind+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(isSort(arr, 0));
    }
}
