public class Case2 {
    public static void main(String[] args) {

        int balance = 2147483645;
        int bonus = 13;


        int TotalBalance = increaseBalance(balance,bonus);

        System.out.println(TotalBalance);
    }

    public static int increaseBalance(int balance,int bonus) {
        int result;
        int intFlow = 0;

        result = balance + bonus;

        if (result < intFlow) {

            System.out.println(intFlow);
        } else {
            System.out.println(result);

        }
        return result;
    }
}