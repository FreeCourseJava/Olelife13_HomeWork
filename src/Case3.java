public class Case3 {
    public static void main(String[] args) {

        int balance = 10;
        int bonus = 0;

        int totalBalance = increaseBalance(balance,bonus);

       System.out.println (totalBalance);}

    public static int increaseBalance(int balance, int bonus) {
        int result;
        int intFlow = 0;

        long summ;
        long balanceL;
        long bonusL;

        balanceL = (long) balance;
        bonusL = (long) bonus;


          summ = balanceL+bonusL;

                if (summ>Integer.MAX_VALUE){
                    System.out.println("выход за рамки возможностей счета: " + intFlow);
                }
                   else if (summ<Integer.MIN_VALUE) {
                    System.out.println("выход за рамки возможностей счета: " + intFlow);}
        result=(int) summ;
        System.out.println("Сумма на счете: " + result);


            return result;
            }

}
