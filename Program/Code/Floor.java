class Floor {
    static int findFloor(int[] arr, int k) {
        int l = 0;
        int n = arr.length;
        int r = n - 1;
        int res = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] < k) {
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 4, 6, 10, 12, 14};
        int k = 5;

        
        int floorIndex = findFloor(arr, k);

        if (floorIndex != -1) {
            System.out.println("The floor of " + k + " is " + arr[floorIndex] + " at index " + floorIndex);
        } else {
            System.out.println("No floor exists for " + k + " in the array.");
        }
    }
}

