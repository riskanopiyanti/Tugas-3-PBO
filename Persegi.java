public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.nama = "Persegi";
        this.sisi = sisi;
        this.hitungLuas(sisi);
        this.hitungKeliling(sisi);
    }

    public void hitungLuas(double sisi) {
        this.luas = sisi * sisi;
    }

    public void hitungKeliling(double sisi) {
        this.keliling = 4 * sisi;
    }

    public double getSisi() {
        return this.sisi;
    }
}