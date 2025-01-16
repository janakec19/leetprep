package Strings;

import java.util.Arrays;

public class SortedArrayMedian {

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        int[] arr3 = new int[arr1.length + arr2.length];
        SortedArrayMedian sortedArrayMedian=new SortedArrayMedian();
        sortedArrayMedian.mergeSort(arr1,arr2,arr3);
        Arrays.stream(arr3).forEach(e-> System.out.print(e));
        System.out.println("Median for Arr "+sortedArrayMedian.medianArr(arr3));
    }

    void mergeSort(int[] arr1, int[] arr2, int[] outputArr) {
        //using merge sort
        //comparing arr1 and arr2 -> put lower value in index
        int i = 0;
        int j = 0;
        int k = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                outputArr[k++] = arr1[i++];
            } else {
                outputArr[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            outputArr[k++] = arr1[i++];
        }
        while (j < n2) {
            outputArr[k++] = arr2[j++];
        }
    }

    double medianArr(int[] arr) {
        int n=arr.length;
        if(n%2==0){
            return  (double)(arr[n/2]+arr[(n-1)/2])/2;
        }else{
            return arr[n/2];
        }
    }

}
