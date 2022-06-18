public class Case1 {
    // Пойдет не так вот что: при цикле или больших числах будет превышено максимальное положительное значение int,
    // и баланс станет отрицательным.
    public static void main(String[] args) {
        int balance = 100;
        int TotalBalance = increaseBalance (balance);

        System.out.println(TotalBalance);
    }
    public static int increaseBalance(int balance)
    {
        int result;
        int bonus = 13;
        result = balance + bonus;
        return result;
    }
}
