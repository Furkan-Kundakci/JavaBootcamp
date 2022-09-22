public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add("Ahmet");
        customerManager.remove("Ahmet");
        customerManager.update("Ahmet");
    }
}
