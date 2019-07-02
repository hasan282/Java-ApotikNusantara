package apotiknusantara;

public class ClassObat {
    int idObat, hargaObat, Stok, idSupp;
    String namaObat, Kategori;

    public ClassObat(int idObat, int Stok, int idSupp, int hargaObat, String namaObat, String Kategori) {
        this.idObat = idObat;
        this.Stok = Stok;
        this.idSupp = idSupp;
        this.hargaObat = hargaObat;
        this.namaObat = namaObat;
        this.Kategori = Kategori;
    }

    public int getIdObat() {
        return idObat;
    }

    public int getStok() {
        return Stok;
    }

    public int getIdSupp() {
        return idSupp;
    }

    public int getHargaObat() {
        return hargaObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public String getKategori() {
        return Kategori;
    }
}
