import java.util.Scanner;

public class liveCode2Pemdas {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int pilihan = 4;
        char loop; 

        do { 
            System.out.println();
            System.out.println("1. Volume Persegi");
            System.out.println("2. Volume Persegi Panjang");
            System.out.println("3. Volume Segitiga");
            System.out.println("4. Volume Lingkaran");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = masuk.nextInt();

            switch(pilihan){
                case 1 : luasPersegi(); break;
                case 2 : luasPersegiPanjang(); break;
                case 3 : luasSegitiga(); break;
                case 4 : luasLingkaran(); break;
            }

            System.out.print("Ulangi lagi? (y/n): ");
            loop = masuk.next().charAt(0);

        } while (loop == 'y' || loop == 'Y'); 
    }

    private static int luasPersegi () {
        Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan panjang Sisi : ");
        int panjangSisi = masuk.nextInt();
        int luasP = panjangSisi * panjangSisi;
        System.out.println("Luas Persegi adalah = "+luasP);
        return luasP;
    }

    private static double luasPersegiPanjang () {
        Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan panjang = ");
        double panjang = masuk.nextInt();
        System.out.print("Masukkan lebar = ");
        double lebar = masuk.nextInt();
        double luasPP = panjang*lebar;
        System.out.println("Luas Persegi Panjang adalah = "+luasPP);
        return luasPP;
    }

    private static double luasSegitiga () {
        Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan alas = ");
        double alas = masuk.nextInt();
        System.out.print("Masukkan tinggi = ");
        double tinggi = masuk.nextInt();
        double luasSgt = alas*tinggi;
        System.out.println("Luas Segitiga = " + luasSgt);
        return luasSgt;
    }

    private static double luasLingkaran () {
        Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan jari jari = ");
        double jariJari = masuk.nextInt();
        double luasLingk = 22.0/7 * jariJari * jariJari;
        System.out.println("Luas Lingkaran adalah = "+ luasLingk);
        return luasLingk;
    }
}
