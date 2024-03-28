package bangunruang;

import bangundatar.persegi;

public class kubus implements geometri {
    private double sisi;

    public kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return new persegi(sisi).hitungLuas() * 6;
    }
}