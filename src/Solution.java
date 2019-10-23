import java.util.ArrayList;
import java.util.List;

class Solution {

    double getMaxK(double[] arr, double a){
        double k=0;
        int maxCount=0;
        int count;
        for (double v : arr) {
            count = getCountOfPoints(arr, v, a);
            if (maxCount < count) {
                maxCount = count;
                k = v;
            }
        }
        return k;
    }
    private int getCountOfPoints(double[] input, double a, double b){
        List<Double> points = new ArrayList<>();
        for (double v : input) {
            if (v >= a && v <= a + b) {
                points.add(v);
            }
        }
        return points.size();
    }
}
