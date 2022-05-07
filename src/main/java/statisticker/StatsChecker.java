package statisticker;

import java.util.Arrays;
import java.util.List;

public class StatsChecker {
    private final float maxThreshold;
    private final IAlerter[] iAlerters;
    public StatsChecker(float maxThreshold, IAlerter[] alerters) {
        this.maxThreshold = maxThreshold;
        this.iAlerters = alerters;
    }

    public void checkAndAlert(List<Float> numbers) {
        Float[] floatArray = numbers.toArray(new Float[0]);
        Arrays.sort(floatArray);
        float maxValue = floatArray[floatArray.length-1];
        if (maxValue > maxThreshold) {
            iAlerters[0].getEmailAlert().emailSent= true;
            iAlerters[0].getLedAlert().ledGlows = true;
        }
    }
}
