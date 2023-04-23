package BT1_Variables;

public class SinhVien {

    //Bien toan cuc
    String lastName = "Trần";

    // Bien static
    public static String firstName = "Hương";


    public static void main(String[] args) {
        //Bien local
        String fullName = "Trần Thị Hương";

        SinhVien sv = new SinhVien();

        System.out.println("Họ: " + sv.lastName);

        System.out.println("Tên: " + firstName);

        System.out.println("Họ và tên: " + fullName);

        System.out.println("");
        System.out.println("----------------------------------------------------------------");
        ThongTin.getInfo();

    }
}
