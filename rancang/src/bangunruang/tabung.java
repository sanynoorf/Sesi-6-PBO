package bangunruang;
import bangundatar.lingkaran;

public class tabung implements geometri {
    private double jariJari;
    private double tinggi;
    private final double PI = Math.PI;

    public tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return new lingkaran(jariJari).hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * PI * jariJari * (jariJari + tinggi);
    }
}