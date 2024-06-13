package ZnewFolder;
public class SecondLargest {
    public static void Largest(int arr[], int n){
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Largest Element: " + max + " " + "Minimum Element: " + min);

        int SecondL = arr[0];
        int SecondM = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > SecondL && arr[i] != max){
                SecondL = arr[i];
            }if(arr[i] < SecondL && arr[i] != min){
                SecondM = arr[i];
            }
        }
        System.out.println("Second Largest Element: "+ SecondL + " " + "Second Minimum element: " + SecondM);
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,2,6,8};
        int n = arr.length;
        Largest(arr, n);

    }
}
