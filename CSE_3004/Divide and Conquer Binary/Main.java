public class Main {
     public int binarySearch(int[] inputArr, int key) {
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    Main mbs = new Main();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Element 3 is found at: "+mbs.binarySearch(arr, 3));
        
    }
}

