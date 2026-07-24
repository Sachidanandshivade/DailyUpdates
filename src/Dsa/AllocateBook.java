package Dsa;

public class AllocateBook {


    static boolean canAllocate(int[] books, int students, int limit) {

        int studentCount = 1;
        int pages = 0;

        for (int book : books) {

            if (pages+book <= limit) {

                pages += book;

            } else {

                studentCount++;

                pages = book;
            }
        }

        return studentCount == students;
    }

    static int allocateBooks(int[] books, int students) {
        if(students> books.length) {
            return -1;
        }
        int low = 0;
        int high = 0;
        for(int book:books) {
            low = Math.max(low,book);
            high += book;
        }
        int ans = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;

            if(canAllocate(books,students,mid)){
                ans = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] books = {12, 34, 67, 90};
        int students = 2;

        System.out.println(allocateBooks(books, students));
    }


}
