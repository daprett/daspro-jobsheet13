import java.util.Scanner;

public class Ucapan_21 {
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+"\nMay the force be with you.");
    }
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan nama yang ingin diberi ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
}
