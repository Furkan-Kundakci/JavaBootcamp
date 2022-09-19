public class Main {

    public static void main(String[] args) {
        String[][] citys = new String[3][3];

        citys[0][0] = "İstanbul";
        citys[0][1] = "Sivas";
        citys[0][2] = "Kırklareli";
        citys[1][0] = "Sakarya";
        citys[1][1] = "Ankara";
        citys[1][2] = "Bilecik";
        citys[2][0] = "Kocaeli";
        citys[2][1] = "Gebze";
        citys[2][2] = "Bolu";

        for (int i = 0; i < 3; i++) {
            System.out.println("------------------------");
            for (int j = 0; j < 3; j++) {
                System.out.println(citys[i][j]);
            }
        }
    }
}
