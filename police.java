public class police {

    public static void main(String[] args) {

        char[] arr = {'P', 'T', 'T', 'P', 'T'};
        int k = 1;

        int n = arr.length;
        int ans = 0;
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P') {
                for (int j = Math.max(0, i - k); j <= Math.min(n - 1, i + k); j++) {
                    if (arr[j] == 'T' && !vis[j]) {
                        vis[j] = true;
                        ans++;
                        break;
                    }
                }
            }
        }

        System.out.println("Maximum number of thieves caught: "+ans);
}
}
