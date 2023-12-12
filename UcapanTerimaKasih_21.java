import java.util.Scanner;

public class UcapanTerimaKasih_21 {
    public static void main(String[] args) {
        UcapanTerimakasih();
    }
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama orang yang ingin anda berikan ucapan : ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }
    public static String UcapanTambahan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan mata pelajaran dari guru :");
        String mapel = sc.nextLine();
        sc.close();
        return mapel;
    }
    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        String mpl = UcapanTambahan();
        System.out.println("Thank you "+nama+" for being the best " + mpl + " teacher in the world.\n"+
        "You inspired in me a love for learnig and made me feel like i could ask you anything");
    }

}
