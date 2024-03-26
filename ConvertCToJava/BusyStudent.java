public class BusyStudent {
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n = endTime.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (endTime[i] - startTime[i] == queryTime) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 2, 7};
        int queryTime = 4;
        System.out.println(busyStudent(startTime, endTime, queryTime));
    }
}

