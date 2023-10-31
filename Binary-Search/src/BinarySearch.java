public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    //  return the index for only shorted array
    // return -1 if it dose not exist
    static  int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start) /2 ;
            if(target < arr[mid]){
                // for asc
                end = mid -1;
                // for dsc = start = mid + 1;
            }else if(target > arr[mid]){
                // for asc
                start = mid + 1;
                // for dsc = end = mid -1;
            }else {
                //ans found
                return mid;
            }
        }
        // id done not exist
        return -1;
    }
}