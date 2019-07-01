package apotiknusantara;

public class ClassSupplier {
    int idSupp;
    String namaSupp, Alamat, Telpon;

    public ClassSupplier(int idSupp, String namaSupp, String Alamat, String Telpon) {
        this.idSupp = idSupp;
        this.namaSupp = namaSupp;
        this.Alamat = Alamat;
        this.Telpon = Telpon;
    }

    public int getIdSupp() {
        return idSupp;
    }

    public String getNamaSupp() {
        return namaSupp;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getTelpon() {
        return Telpon;
    }
}
