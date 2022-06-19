import java.util.Date;

public class Case1 {
    public static void main(String[] args) {
        long numberOfDays = -30L;

        long nymberOfDaysMs = numberOfDays * 24 * 60 *60* 1000;
        long TimeDataMillisec = DataMillise(nymberOfDaysMs);

        Date DataSchet = new Date(TimeDataMillisec);
        System.out.println(TimeDataMillisec);
        System.out.println(DataSchet);
    }
    public static long DataMillise(long nymberOfDaysMs){
            long result;
            long DayToday = System.currentTimeMillis();
                        result = DayToday+nymberOfDaysMs;
            return result;

        }

}
