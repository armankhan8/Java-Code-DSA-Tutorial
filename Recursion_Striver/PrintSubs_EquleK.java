package Recursion_Striver;

import java.util.ArrayList;

class PrintSubs_EquleK{
    public static void PrintAll(int arr[], int ind, int n, ArrayList<Integer>list, int k, int sum){
        if(ind == n){
            if(sum == k){
                for(int num : list){
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            return;
        }
        list.add(arr[ind]);
        sum += arr[ind];
        PrintAll(arr, ind+1, n, list, k, sum);
        list.remove(list.size()-1);
        sum -= arr[ind];
        PrintAll(arr, ind+1, n, list, k, sum);
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2};
        int n = 3;
        int k = 2;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        PrintAll(arr, 0, n, list, k, sum);

    }
}