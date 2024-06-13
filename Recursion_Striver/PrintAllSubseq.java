package Recursion_Striver;

import java.util.ArrayList;

class PrintAllSubseq{
    public static void PrintAll(int arr[], int ind, int n, ArrayList<Integer>list){
        if(ind>=n){
            for(int num : list){
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        list.add(arr[ind]);
        PrintAll(arr, ind+1, n, list);
        list.remove(list.size()-1);
        PrintAll(arr, ind+1, n, list);
        
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 2};
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        PrintAll(arr, 0, n, list);

    }
}