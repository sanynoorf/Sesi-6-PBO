package bangundatar;

public class lingkaran implements Shape {
    private double jariJari;
    private final double PI = Math.PI;

    public lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * PI * jariJari;
    }
}