public class Case1 {
    // Пойдет не так вот что: при цикле или больших числах будет превышено максимальное положительное значение int,
    // и баланс станет отрицательным.
    public static void main(String[] args) {
        int balance = 100;
        int bonus = 13;

        int TotalBalance = increaseBalance (balance,bonus);

        System.out.println(TotalBalance);
    }
    public static int increaseBalance(int balance, int bonus)
    {
        int result;
        result = balance + bonus;
        return result;
    }
}
