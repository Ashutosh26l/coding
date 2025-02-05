public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 18,12,7,-7,28 };
        System.out.println(Min(arr));
    }

    static int Min(int[] arr) {
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
