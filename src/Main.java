public class Main {
    public static void main(String[] args) {
        double ticketPrice = 9999.99;
        int rublesForOneBonus = 20;
        int milli = (int) Math.floor(ticketPrice / rublesForOneBonus);
        System.out.println(milli);
    }
}