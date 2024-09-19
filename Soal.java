import java.util.Scanner;

public class Soal {
    public static double hitungLuas(int sisi){
        return sisi * sisi;
    }
    public static double hitungLuas(int panjang, int lebar){
        return panjang * lebar;
    }
    public static double hitungLuas(int jariJari, double Phi){
        return Phi * jariJari * jariJari;
    }
    public static double hitungKeliling(int sisi){
        return sisi * 4;
    }
    public static double hitungKeliling(int panjang, int lebar){
        return 2 * (panjang + lebar);
    }
    public static double hitungKeliling(int jariJari, double Phi){
        return 2 * Phi * jariJari;
    }

    public static void pilihJenisBangunDatar(){
        Scanner input = new Scanner(System.in);
        int Pilihan = input.nextInt();
        switch (Pilihan){
            case 1 :
                System.out.print("Masukan sisi persegi : ");
                int sisi = input.nextInt();
                System.out.println("Luas persegi : " + hitungLuas(sisi) + "\n" + "Keliling Persegi : " + hitungKeliling(sisi));
                break;
            case 2 :
                System.out.print("Masukan panjang persegi : ");
                int panjang = input.nextInt();
                System.out.print("Masukan lebar persegi : ");
                int lebar = input.nextInt();
                System.out.println("Luas persegi panjang : " + hitungLuas(panjang,lebar) + "\n" + "Keliling Persegi : " + hitungKeliling(panjang,lebar));
                break;
            case 3 :
                System.out.print("Masukan Jari - Jari : ");
                int jariJari = input.nextInt();
                System.out.println("Luas lingkaran : " + hitungLuas(jariJari,Math.PI) + "\n" + "Keliling Persegi : " + hitungKeliling(jariJari,Math.PI));
                break;
        }

    }

    public static void main(String[] args) {
        System.out.println("Masukan Bangun Datar : \n");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi Panjang");
        System.out.print("3.Lingkaran\nMasukan Pilihan : ");
        pilihJenisBangunDatar();
    }
}
