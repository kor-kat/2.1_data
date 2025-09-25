public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int deposit_amount = 1100;
        int limit = 1000;
        int bonus_rate = 1;
        int bonus_step = 100;
        int bonus = 0;
        if (deposit_amount >= limit) {
            bonus = (deposit_amount / bonus_step) * bonus_rate;
        }
        int final_balance = balance + deposit_amount + bonus;
        System.out.println(final_balance);
    }
}