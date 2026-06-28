package bagian3.kontak;

public class MainKontak {

    public static void main(String[] args) {
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Bened", "+123123", "bened@gmail.com"));
        buku.tambahKontak(new Kontak("Martis", "+123123", "martis@gmail.com"));
        buku.tambahKontak(new Kontak("Selena", "+123123", "selena@gmail.com"));
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println();
        bukuLain.cariKontak("Bened");
        System.out.println();
        bukuLain.hapusKontak("Bened");
        System.out.println();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
    }
}
