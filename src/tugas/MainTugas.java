//Nama : Ridho Azizul Lambaran
//NPM : 2410010111
package tugas;

public class MainTugas {

    public static void main(String[] args) {
        String[] kategori = {"Magic Damage", "Magic Pen", "Mana/Regen"};
        System.out.println("=== Daftar Kategori Item Magic ===");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Blood Wings", 2100, 10));
        gudang.tambahBarang(new Barang("Holy Crystal", 1600, 15));
        gudang.tambahBarang(new Barang("Genius Wand", 2000, 20));
        gudang.tambahBarang(new Barang("Lightning Truncheon", 2250, 12));
        gudang.tambahBarang(new Barang("Ice Queen Wand", 1490, 25));

        gudang.tampilkanSemua();
        gudang.simpanKeBerkas();

        System.out.println();
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println("Total nilai persediaan item = Rp" + gudangBaru.totalNilai());
    }
}
