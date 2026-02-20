public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Given an array of meeting time interval objects consisting of start and end times [[start_1,end_1],[start_2,end_2],...] (start_i < end_i), find the minimum number of rooms required to schedule all meetings without any conflicts.
        
        Note: (0,8),(8,10) is NOT considered a conflict at 8.
        
        Example 1:
        
        Input: intervals = [(0,40),(5,10),(15,20)]
        
        Output: 2
        Explanation:
        day1: (0,40)
        day2: (5,10),(15,20)
        
        Example 2:
        
        Input: intervals = [(4,9)]
        
        Output: 1
         */
        int[][] intervals = { { 0, 40 }, { 5, 10 }, { 15, 20 } };
        Solution solution = new Solution();
        int result = solution.minMeetingRooms(intervals);
        System.out.println("The meeting rooms needed to accomodate the meeting intervals mentioned above are: "+result);
    }
}
