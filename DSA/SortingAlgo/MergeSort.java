package DSA.SortingAlgo;
public class MergeSort {

    static void merge(int arr[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int temp[] = new int[arr.length];

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        for (int l = low; l <= high; l++) {
            arr[l] = temp[l];
        }
    }

    static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    static void display(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 6, 4, 7, 9, 7};
        int n = arr.length;
        display(arr, n);
        mergeSort(arr, 0, n - 1);
        System.out.println();
        display(arr, n);
    }
}
