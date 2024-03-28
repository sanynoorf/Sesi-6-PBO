package bangunruang;

public class bola implements geometri {
    private double jariJari;
    private final double PI = Math.PI;

    public bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return (4.0/3) * PI * Math.pow(jariJari, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 4 * PI * Math.pow(jariJari, 2);
    }
}