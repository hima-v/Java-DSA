/* Tag: 1011. Capacity To Ship Packages Within D Days
   Level: Medium
   Approach: 1 Binary Search on Answer */

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 1;
        int i, mid;
        int ans = 0;
        int total = 0;
        int len = weights.length;
        for (i = 0; i < len; i++) {
            total = total + weights[i];
        }
        int h = total;
        while (l <= h) {
            mid = l + (h - l) / 2; // mid is the ship capacity.
            if (possible(mid, weights, days)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public boolean possible(int mid, int[] w, int d) {
        int daily_wt = 0;
        int days_took = 0;
        int j;
        for (j = 0; j < w.length; j++) {
            daily_wt += w[j];
            if (daily_wt > mid) {
                days_took += 1;
                daily_wt = 0;
            }
        }
        return (days_took <= d);
    }
}