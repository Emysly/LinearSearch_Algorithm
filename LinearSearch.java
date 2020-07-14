class LinearSearch {
    public static int search(int[] A, int n) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == n) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,6,7}, 4));
    }
}