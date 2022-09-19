public class Main {

    public static void main(String[] args) {
        String student1 = "Engin";
        String student2 = "Derin";
        String student3 = "Salih";
        String student4 = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("------------------");

        String[] students = new String[3];
        students[0] = "Engin";
        students[1] = "Salih";
        students[2] = "Ahmet";

        for (int j = 0; j < students.length; j++) {
            System.out.println(students[j]);
        }

        System.out.println("------------------");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
