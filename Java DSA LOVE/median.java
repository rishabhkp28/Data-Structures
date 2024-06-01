public class median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if (n > m)
            return findMedianSortedArrays(nums2, nums1);
        int half = (nums1.length + nums2.length) / 2;
        int ul = 0;
        int ll = 0;
        if (half < n) {
            ul = half;
        } else {
            ul = n;
        }
        int answer = 0;
        while (ul >= ll) {
            int select = ll + (ul - ll) / 2;

            int Aleft = select > 0 ? nums1[select - 1] : Integer.MIN_VALUE;
            int Aright = select < n ? nums1[select] : Integer.MAX_VALUE;

            int rest = half - select;
            int Bleft = rest > 0 ? nums2[rest - 1] : Integer.MIN_VALUE;
            int Bright = rest < m ? nums2[rest] : Integer.MAX_VALUE;

            if (Aleft > Bright) {
                ul = select - 1;
            } else if (Bleft > Aright) {
                ll = select + 1;
            } else {
                if ((n + m) % 2 == 0) {
                    return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
                } else {
                    return Math.min(Aright, Bright);
                }

            }
        }
        return 0;//dummy statement
    }

}