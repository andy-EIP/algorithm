import java.util.Arrays;
import java.util.Comparator;

public class Main {
   public static void main(String[] args) {
      System.out.println(new Solution().canAttendMeetings(new int[][]{{0,30}, {5,10} , {15,20}}));
      System.out.println(new Solution().canAttendMeetings(new int[][]{{7, 10}, {2, 4}}));
   }
}

class Solution {
   public boolean canAttendMeetings(int[][] intervals) {

      Arrays.sort(intervals, new Comparator<int[]>() {
         @Override
         public int compare(int[] o1, int[] o2) {
            return o1[0] - o2[0];
         }
      });

      for (int i = 0; i < intervals.length-1; i++) {
         if(intervals[i][1] > intervals[i+1][0]){
            return false;
         }
      }

      return true;
   }
}
