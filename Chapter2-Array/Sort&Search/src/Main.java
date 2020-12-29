import java.util.*;
public class Main {
    public static void main(String args[]) {
        int[] arr = {75,3,45,25,17,1,5,78};
        System.out.println("Bubble Sort:");
        System.out.println(Arrays.toString(arr));
        bubleSort(arr);
        System.out.println(Arrays.toString(arr));
        int search = 78;
        System.out.println("Bubble Search for "+search);
        System.out.println(bubleSearch(arr,search));
    }
    
    public static void bubleSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int selected = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>selected){
                arr [j+1]=arr[j];
                j--;
            }
            arr[j+1]=selected;
        }
    }
    public static int bubleSearch(int[] arr ,int search){
        int lo = 0;
        int high = arr.length;
        while(lo<high){
            int mid = (lo+high)/2;
            if(arr[mid]==search){
                return mid;
            }else if(arr[mid]<search){
                lo=mid+1;
            }else{
                high = mid;
            }
        }
        return -1;
    }
}