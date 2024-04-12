public class Code53 {
        public static int[] findMinMaxRec(int[] arr, int l, int r) {
            if (l == r) {
                return new int[]{arr[l], arr[l]};
            }
    
            if (l + 1 == r) {
                if (arr[l] < arr[r]) {
                    return new int[]{arr[l], arr[r]};
                } else {
                    return new int[]{arr[r], arr[l]};
                }
            }
    
            int mid = l + (r - l) / 2;
            int[] leftMinMax = findMinMaxRec(arr, l, mid);
            int[] rightMinMax = findMinMaxRec(arr, mid + 1, r);
    
            int leftMin = leftMinMax[0];
            int leftMax = leftMinMax[1];
            int rightMin = rightMinMax[0];
            int rightMax = rightMinMax[1];
    
            if (leftMin < rightMin) {
                min = leftMin;
            } else {
                min = rightMin;
            }
    
            if (leftMax > rightMax) {
                max = leftMax;
            } else {
                max = rightMax;
            }
    
            return new int[]{min, max};
        }
    
        public static void main(String[] args) {
            int[] arr = {3, 5, 2, 7, 1};
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
    
            int[] minMax = findMinMaxRec(arr, 0, arr.length - 1);
    
            System.out.println("Minimum value: " + minMax[0]);
            System.out.println("Maximum value: " + minMax[1]);
        }
    }
    

