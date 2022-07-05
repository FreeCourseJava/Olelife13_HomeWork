
public class Case1 {
    public static void main(String[] args) {
        long numberOfDays = -30L;

        long timeDataMillisec = DataMillise(numberOfDays);

        Date DataSchet = new Date(timeDataMillisec);
        System.out.println(timeDataMillisec);
        System.out.println(DataSchet);
    }
    public static long DataMillise( long numberOfDays){
            long result;
            long numberOfDaysMs = numberOfDays * 24 * 60 *60* 1000;
            long dayToday = System.currentTimeMillis();
                        result = dayToday+numberOfDaysMs;
            return result;

        }

}
