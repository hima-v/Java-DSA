import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class B_The_Corridor_or_There_and_Back_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int no_traps = sc.nextInt();
            long[][] info = new long[no_traps][2];
            for (int j = 0; j < no_traps; j++) {
                info[j][0] = sc.nextLong();
                info[j][1] = sc.nextLong();
            }
            long low = 1;
            long high = 10;
            long mid = 0;
            long ans = 1;
            // while to set high
            while (high > low + 1) {
                mid = low + (high - low) / 2;
                if (binsearch(info, mid, no_traps)) {
                    low = mid;
                    ans = low;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(ans);
        }
    }

    public static boolean binsearch(long[][] traps, long k, int total_traps) {
        Arrays.sort(traps, new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                // Compare the first elements of the subarrays
                return Long.compare(o1[0], o2[0]);
            }
        });

        // Store the sorted array in a new variable
        long[][] traps_info = traps;

        long first_trap_room = traps_info[0][0];
        long max_rooms_visit = traps_info[0][1] / 2 - 1 + traps_info[0][1];
        if (max_rooms_visit < k) {
            return false;
        } else {
            int room_visits =0;
            for (long j = first_trap_room+1; j < max_rooms_visit; j++) {
                int c = traps_info[];
                if (j== traps_info[c][0]){
                    max_rooms_visit= traps_info[c][1]/2 -1 + traps_info[];
                    j=0;
                }
            }
        }
        // we can go to
    }
}
