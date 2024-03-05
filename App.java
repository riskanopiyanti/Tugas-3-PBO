public class App {
    public static void main(String[] args) throws Exception {
        Lingkaran lingkaran = new Lingkaran(7.0);
        lingkaran.getInfo();

        Persegi persegi = new Persegi(5.0);
        persegi.getInfo();

        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(6.0);
        segitigaSamaSisi.getInfo();

        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(4.0);
        segitigaSamaKaki.getInfo();

        SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku(5.0);
        segitigaSikuSiku.getInfo();

        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(6.0, 4.0);
        segitigaSembarang.getInfo();
    }
}