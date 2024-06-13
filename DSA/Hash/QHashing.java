package DSA.Hash;

import java.util.HashSet;

import DSA.Hash.hashmap2.HashMap;

public class QHashing {
    // Q Majority element appear more than n / 3
    public static void Majority(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], nums[i] + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                System.out.println(key);
            }
        }
    }

    public static void Union(int nums1[], int nums2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            set.add(nums2[j]);
        }

        // return set.size();
        System.out.println(set);

    }

    public static int Intersection(int nums1[], int nums2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        int count = 0;
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                count++;
                set.remove(nums2[j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // int nums1[] = {7, 3, 9};
        // int nums2[] = {6, 3, 9, 2, 9, 4};
        // Majority(nums);
        // Union(nums1, nums2);
        // System.out.println(Union(nums1, nums2));
        // System.out.println(Intersection(nums1, nums2))





        // Subaray Sum equle to k
        int arr[] = { 10, 2, -2, -20, 10 };
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int k = -10;
        int ans = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        System.out.println(ans);

    }
}
