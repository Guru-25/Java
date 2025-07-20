public class Sq {

    /**
     * Optimal Solution: Uses Binary Search to find the integer square root.
     * This is much more efficient for large numbers.
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int sqrtOptimal(int x) {
        // Edge cases
        if (x == 0 || x == 1) {
            return x;
        }

        long start = 1;
        long end = x;
        long ans = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid; // Use long to prevent overflow

            if (square == x) {
                return (int) mid; // Found the perfect square
            }

            if (square < x) {
                // This 'mid' could be our answer, so we store it and
                // look for a potentially larger answer in the right half.
                ans = mid;
                start = mid + 1;
            } else {
                // The square is too big, so we discard the right half.
                end = mid - 1;
            }
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        long n=sqrtOptimal(24);
        System.out.println(n*n);
    }
}