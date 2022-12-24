import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);
        Restaurant ress = new Restaurant();
        int customerID, orderQty;
        try {
            System.out.print("Enter Customer ID: ");
            customerID = inputt.nextInt();

            System.out.print("Enter how much food to made: ");
            orderQty = inputt.nextInt();

            Thread t1 = new Thread(ress);
            Waiters waiter = new Waiters(orderQty,customerID);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }
    }
}