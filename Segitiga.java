public abstract class Segitiga extends BangunDatar {
    protected double alas;
    protected double tinggi;

    public Segitiga(double alas, double tinggi) {
        super.nama = "Segitiga";
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public abstract void hitungLuas(double alas, double tinggi);

    public abstract void hitungKeliling(double alas, double tinggi);
}

class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double sisi) {
        super(sisi, sisi * Math.sqrt(3) / 2);
    }

    public void hitungLuas(double sisi, double tinggi) {
        this.luas = 0.5 * sisi * tinggi;
    }

    public void hitungKeliling(double sisi, double tinggi) {
        this.keliling = 3 * sisi;
    }

    public double getSisi() {
        return this.alas;
    }
}

class SegitigaSamaKaki extends Segitiga {
    public SegitigaSamaKaki(double sisi) {
        super(sisi, sisi * Math.sqrt(2) / 2);
    }

    public void hitungLuas(double sisi, double tinggi) {
        this.luas = 0.5 * sisi * tinggi;
    }

    public void hitungKeliling(double sisi, double tinggi) {
        this.keliling = 3 * sisi;
    }

    public double getSisi() {
        return this.alas;
    }
}

class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(double sisi) {
        super(sisi, sisi);
    }

    public void hitungLuas(double sisi, double tinggi) {
        this.luas = 0.5 * sisi * tinggi;
    }

    public void hitungKeliling(double sisi, double tinggi) {
        this.keliling = sisi + 2 * Math.sqrt(2) / 2 * sisi;
    }

    public double getSisi() {
        return this.alas;
    }
}

class SegitigaSembarang extends Segitiga {
    private double alas;

    public SegitigaSembarang(double alas, double tinggi) {
        super(alas, tinggi);
        this.alas = alas;
        this.hitungLuas(alas, tinggi);
        this.hitungKeliling(alas, tinggi);
    }

    public void hitungLuas(double alas, double tinggi) {
        this.luas = 0.5 * alas * tinggi;
    }

    public void hitungKeliling(double alas, double tinggi) {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        this.keliling = alas + tinggi + sisiMiring;
    }

    public double getAlas() {
        return this.alas;
    }
}