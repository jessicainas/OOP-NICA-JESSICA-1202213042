public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;
    
    public Waiters(int orderQty, int customerID) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }
    @Override
    public void run() {
        // call getfood method and pending it to 5000 ms
        while (true) {
            makeFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " +customerID);
        System.out.println("Numbeer of food: " + orderQty);
        System.out.println("Total Price: " +orderQty * foodPrice);
        System.out.println("==========================================================");
    }
    // create synchronized method getCoffee
    public void makeFood() {
        synchronized(Restaurant.getLock()) {
            System.out.println("Waiter: food is ready to deliver");
            Restaurant resto = new Restaurant();
            resto.setWaitingForPickup(false);
            // check if value of getFoodNumber from restaurant class is equal to orderQty
            // if same, call method orderInfo() to print order info and exit the program
            if (Restaurant.getFoodNumber() == orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the Restaurant to make another food\n");
        }
    }
}