public static int Overlapping(int n,int[][] meetings) {
    Arrays.sort(meetings, (a,b)-> Integer.compare(a[1],b[1]));
    int count = 0;
    int lastEnd = -1;
    for(int i=0;i<n;i++) {
        if(meetings[i][0] >= lastEnd) {
            count++;
            lastEnd = meetings[i][1];
        }
    }
    return count;
}