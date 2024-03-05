public class Lingkaran extends BangunDatar {
    private double r;

    public Lingkaran(double r) {
        this.nama = "Lingkaran";
        this.r = r;
        this.hitungLuas(r);
        this.hitungKeliling(r);
    }

    public void hitungLuas(double r) {
        this.luas = 3.14 * r * r;
    }

    public void hitungKeliling(double r) {
        this.keliling = 2 * 3.14 * r;
    }

    public double getR() {
        return this.r;
    }
}