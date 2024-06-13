package DSA.SortingAlgo;

public class QuickSort {
    public static int partitionInd(int arr[], int low, int n){
        int i = low+1;
        int pivot = arr[low];
        int j = n;
        do{
            while (arr[i] <= pivot) {
                i++;
            }
            while(arr[j] > pivot){
                j--;

            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }while(i<j);

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;



    }
    public static void quicksort(int arr[], int low, int n){
        if(low<n){
            int pivot = partitionInd(arr, low, n);
            quicksort(arr, low, pivot-1);
            quicksort(arr, pivot+1, n);
        }

    }
    public static void display(int arr[], int n){
        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,1,3,5,7,6,4,33};
        int n = arr.length;
        quicksort(arr, 0, n-1);
        display(arr, n);
    }
}
