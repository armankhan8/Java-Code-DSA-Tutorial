package ZnewFolder;
public class IsSortedOrNot {
    public static boolean isSorted(int arr[], int n){
        for(int i = 0; i<n; i++){
            if(arr[i] < arr[i+1]){
                
            }else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,3333,5,6};
        int n = arr.length-1;
        System.out.println(isSorted(arr, n));

    }
}
