package bangundatar;

public class segitigaSamaKaki extends segitiga {
    private double sisiMiring;

    public segitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi);
        this.sisiMiring = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas + 2 * sisiMiring;
    }
}