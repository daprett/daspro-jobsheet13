import java.util.Scanner;

public class nomer2dan3 {
    public static void main(String[] args) {
        inputmahasiswa();
        menampilkanNilaiMhs();
        hariNilaiTertinggi();
        mhsnilaitertinggi();
    }
    static Scanner sc = new Scanner(System.in);
    static int jmlhMahasiswa, jmlhTugas;
    static String[] mahasiswa;
    static int[][] nilai;

    static void inputmahasiswa() {
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlhMahasiswa = sc.nextInt();
        sc.nextLine();

        mahasiswa = new String[jmlhMahasiswa];
        nilai = new int[jmlhMahasiswa][];

        for (int i = 0; i < jmlhMahasiswa; i++) {
            nilai[i] = new int[jmlhTugas];
            System.out.print("Masukkan nilai pada mahasiswa " + mahasiswa[i]);
            for (int j = 0; j < jmlhTugas; j++) {
                System.out.println("Nilai " + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
    }

    static void menampilkanNilaiMhs() {
        for (int i = 0; i < jmlhMahasiswa; i++) {
            System.out.println("Nilai " + mahasiswa[i] + " :");
            for (int j = 0; j < jmlhTugas; j++) {
                System.out.println("Tugas " + (j + 1) + " : " + nilai[i][j]);
            }
            System.out.println();
        }
    }

    static void hariNilaiTertinggi() {
        int[] maxNilai = new int[7];
        int[] harimax = new int[7];

        for (int i = 0; i < 7; i++) {
            int max = -1;
            int index = -1;

            for (int j = 0; j < 5; j++) {
                if (nilai[i][j] > max) {
                    max = nilai[i][j];
                    index = j;
                }
                maxNilai[i] = max;
                harimax[i] = index;
            }
            max = maxNilai[0];
            int hari = 0;
            for (int j = 0; j < harimax.length; j++) {
                if (maxNilai[i] > max) {
                    max = maxNilai[i];
                    hari = i;
                }
            }
            System.out.println("Hari dengan nilai tertinggi adalah minggu ke " + (hari + 1));
        }
    }

    static void mhsnilaitertinggi() {
        int[] maxNilai = new int[5];
        int[] minggumax = new int[5];

        for (int i = 0; i < 5; i++) {
            int max = -1;
            int index = -1;

            for (int j = 0; j < 7; j++) {
                max = nilai[i][j];
                index = j;
            }
            maxNilai[i] = max;
            minggumax[i] = index;
        }
        int max = maxNilai[0];
        int index = 0;
        for (int i = 1; i < 5; i++) {
            max = maxNilai[i];
            index = i;
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah : "+ mahasiswa[index]+
        " pada minggu ke-"+(minggumax[index]+1)+"dengan nilai "+ max );

    }
}
