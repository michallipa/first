public class Conventer {
    public static void main(String[] args) {
        MetricConventer convert = new MetricConventer();
        double m = 2.5;
        double mToCm = convert.metersToCm(m);
        double mToMm = convert.metersToMm(m);
        System.out.println(m + " to " + mToCm + " cm i " + mToMm + "mm");

        TimeConventer conventer = new TimeConventer();
        int h = 14;
        int minutes = conventer.hToMin(h);
        int seconds = conventer.minToS(minutes);
        int millis = conventer.sToMilis(seconds);
        System.out.println(h + " godzin to " + millis + " milisekund");
    }
}
