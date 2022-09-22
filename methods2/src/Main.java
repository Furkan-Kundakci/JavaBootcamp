public class Main {

    public static void main(String[] args) {
        String message = "Bu gün hava çok güzel";
        String newMessage = giveCity() ;
        System.out.println(newMessage);
        int number = summation(5,7);
        System.out.println(number);
        System.out.println(summationTwo(1,2,3,4,5));
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static String giveCity(){
        return "Ankara";
    }
    public static int summation(int numberOne, int numberTwo){
        return numberOne+numberTwo;
    }
    public static int summationTwo(int... numbers){
        int total=0;
        for (int number : numbers){
            total += number;
        }
        return total;
    }
}
