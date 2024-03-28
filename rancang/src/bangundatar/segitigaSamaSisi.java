package bangundatar;


public class segitigaSamaSisi extends segitiga {
    public segitigaSamaSisi(double sisi) {
        super(sisi, (Math.sqrt(3) / 2) * sisi);
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 3 * alas;
    }
}