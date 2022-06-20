public class Case3 {
    public static void main(String[] args) {

        int balance = 21474847;
        int bonus = -3000;

        long totalBalance = increaseBalance(balance,bonus);}

    public static int increaseBalance(int balance, int bonus) {
        int result;
        int intFlow = 0;

        long summ;
        long balanceL;
        long bonusL;
        balanceL = (long) balance;
        bonusL = (long) bonus;


          summ = balanceL+bonusL;
                if (summ>Integer.MAX_VALUE|summ<Integer.MIN_VALUE){
                    System.out.println("выход за рамки возможностей счета: " + intFlow);
                }
                   else System.out.println("Сумма на счете: " + summ);

          result=(int) summ;
            return result;
            }

}
