public class Case2 {
    public static void main(String[] args) {
        int balance = 2147483645;
        int TotalBalance = increaseBalance(balance);

        System.out.println(TotalBalance);
    }

    public static int increaseBalance(int balance) {
        int result;
        int bonus = 13;
        int summMax = 2147483647;
        int summMin = -2147483648;
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