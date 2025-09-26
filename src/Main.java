public class Main {
    public static void main(String[] args) {

        double balance = 100.99;
        double depositAmount = 1_001.99;
        int limit = 1000;
        int bonusRate = 1;
        int bonusStep = 100;
        int bonus = 0;
        if (depositAmount >= limit) {
            bonus = (int) (depositAmount / bonusStep) * bonusRate;
        }
        double final_balance = balance + depositAmount + bonus;
        System.out.println(final_balance);
    }
}