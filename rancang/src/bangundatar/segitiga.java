package bangundatar;

public abstract class segitiga implements Shape {
    protected double alas;
    protected double tinggi;

    public segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // abstract method for subclasses to implement
    public abstract double hitungLuas();

    // abstract method for subclasses to implement
    public abstract double hitungKeliling();
}