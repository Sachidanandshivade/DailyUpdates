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


// job sequennce

public static long[] jobSequencing(int n, int[][] jobs) {
    Arrays.sort(jobs,(a,b)-> b[1]-a[1]);
    int maxDeadline = 0;
    for(int i=0;i<n;i++) {
        maxDeadline = Math.max(maxDeadline,jobs[i][0]);
    }
    int slot[] = new int[maxDeadline+1];

    Arrays.fill(slot,-1);

    int count = 0;
    int totalProfit = 0;
    for(int i=0;i<n;i++) {
        int deadline = jobs[i][0];
        int profit = jobs[i][1];
        for(int day = deadline ;day>=1;day--) {
            if(slot[day] == -1){
                slot[day] = i;
                count++;
                totalProfit += profit;
                break;
            }
        }
    }
    return new long[]{count, totalProfit};
}


// binary tree zigzag level order traversal

public List<List<Integer>> zigzag(TreeNode root) {
    List<List<Integer>> result = new arrayList<>();
    if(root == null) return result;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    boolean leftR = true;
    while(!queue.isEmpty()) {
        int size = queue.size();
        LinnkedList<Integer> clevel = new LinkedList<>();

        for(int i=0;i<levelSize;i++) {
            TreeNode currentNode = queue.poll();
            if(leftR) {
                clevel.addLast(currentNode.val);
            } else {
                clevel.addFirst(currentNode.val);
            }
        }
    }
}