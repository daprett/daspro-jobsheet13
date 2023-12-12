import java.util.Scanner;

public class Kubus21 {
    static Scanner sc = new Scanner(System.in);
    static int ss;

    static int volumeKubus(){
        int volume = ss*ss*ss;
        return volume;
    }

    static int luasPermukaan(){
        int jumlahss = 6;
        int lpermukaan = jumlahss * (ss * ss);
        System.out.println("Luas permukaan kubus adalah : " + lpermukaan );
        return lpermukaan;
    }
    public static void main(String[] args) {
        System.out.print("Masukkan panjang sisi : ");
        ss = sc.nextInt();
        System.out.println("volume dari kubus adalah : " + volumeKubus());
        luasPermukaan();
    }
}
