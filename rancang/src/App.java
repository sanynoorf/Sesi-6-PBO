import bangundatar.*;
import bangunruang.*;

public class App {
    public static void main(String[] args) {
        // Bangun Datar
        Shape persegiPanjang = new persegiPanjang(5, 3);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());

        Shape persegi = new persegi(4);
        System.out.println("\nLuas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

        Shape lingkaran = new lingkaran(7);
        System.out.println("\nLuas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());

        segitiga segitigaSamaKaki = new segitigaSamaKaki(6, 4);
        System.out.println("\nLuas Segitiga Sama Kaki: " + segitigaSamaKaki.hitungLuas());
        System.out.println("Keliling Segitiga Sama Kaki: " + segitigaSamaKaki.hitungKeliling());

        segitiga segitigaSamaSisi = new segitigaSamaSisi(5);
        System.out.println("\nLuas Segitiga Sama Sisi: " + segitigaSamaSisi.hitungLuas());
        System.out.println("Keliling Segitiga Sama Sisi: " + segitigaSamaSisi.hitungKeliling());

        // Bangun Ruang
        geometri kubus = new kubus(4);
        System.out.println("\nVolume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

        geometri balok = new balok(5, 3, 2);
        System.out.println("\nVolume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        geometri bola = new bola(6);
        System.out.println("\nVolume Bola: " + bola.hitungVolume());
        System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());

        geometri tabung = new tabung(5, 8);
        System.out.println("\nVolume Tabung: " + tabung.hitungVolume());
        System.out.println("Luas Permukaan Tabung: " + tabung.hitungLuasPermukaan());
    }
}
