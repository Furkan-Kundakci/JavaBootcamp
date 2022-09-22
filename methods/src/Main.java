public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] numbers = {1, 4, 2, 7, 3, 9};
        int wanted = 5;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == wanted) {
                isThere = true;
            }
        }

        if (isThere) {
            sendMessage("Aranan deger mevcut: " + wanted);
        } else {
            sendMessage("Aranan deger bulunamadı: " + wanted);
        }
    }

    public static void sendMessage(String message) {
        System.out.println(message);
    }
}
