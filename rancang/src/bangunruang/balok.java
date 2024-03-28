package bangunruang;

import bangundatar.persegiPanjang;

public class balok implements geometri {
    private double panjang;
    private double lebar;
    private double tinggi;

    public balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return new persegiPanjang(panjang, lebar).hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (new persegiPanjang(panjang, lebar).hitungLuas() + (panjang * tinggi) + (lebar * tinggi));
    }
}