package statisticker;

import java.util.Arrays;
import java.util.List;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Stats stats = new Stats();
        if (!numbers.isEmpty()) {
            float sum = 0;
            Float[] floatArray = numbers.toArray(new Float[0]);
            int arrayLen = floatArray.length;
            for (Float aFloat : floatArray) {
                sum += aFloat;
            }

            float avg = sum / arrayLen;
            Arrays.sort(floatArray);
            stats.min = floatArray[0];
            stats.max = floatArray[arrayLen - 1];
            stats.average = avg;
        } else {
            stats.min = Float.NaN;
            stats.max = Float.NaN;
            stats.average = Float.NaN;
        }
        return stats;
    }
    public static class  Stats {
        public float max;
        public float average;
        public float min;
    }
}
