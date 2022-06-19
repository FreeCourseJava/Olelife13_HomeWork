public class Case3 {
    public static void main(String[] args) {

        int balance = 1000;

        int TotalBalance = increaseBalance(balance);
        System.out.println(TotalBalance);

    }
        public static int increaseBalance(int balance) {
            int result;
            int bonus = 13;
            int summMax = 2147483640;
            int summMin = -2147483640;
            int intFlow = 0;

            result = balance+bonus;

            int indicator = balance*bonus;
            System.out.println(indicator);
            if (indicator >0) {
                if (result > summMax){
                System.out.println(intFlow);
            } else if (result < summMin){
                System.out.println(intFlow);
            } else System.out.println(result);}
            return result;
        }
}
