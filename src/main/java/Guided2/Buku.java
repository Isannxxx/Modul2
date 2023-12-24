package Guided2;

public class Buku {
    private String judul;
    private String pengarang;

    public Buku() {
        judul = "Tidak Diketahui ";
        pengarang = "Tidak Diketahui";
    }

    public Buku(String judul, String pengarang) {
        System.out.println("konstruktor buku sedang dijalankan...");
        this.judul = judul;
        this.pengarang = pengarang;
    }

    void cetakKeLayar() {
        if (judul == null && pengarang == null)
            return;
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
    }

}
