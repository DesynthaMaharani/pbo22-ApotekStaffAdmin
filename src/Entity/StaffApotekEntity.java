package Entity;


public class StaffApotekEntity {
    String namaobat,jenisobat,harga;

    public StaffApotekEntity(String namabat, String jnsobt, String hrg){
        this.namaobat = namabat;
        this.jenisobat = jnsobt;
        this.harga = hrg;
    }

    public StaffApotekEntity(){

    }

    public String getNamaobat() {
        return namaobat;
    }

    public void setNamaobat(String namaobat) {
        this.namaobat = namaobat;
    }

    public String getJenisobat() {
        return jenisobat;
    }

    public void setJenisobat(String jenisobat) {
        this.jenisobat = jenisobat;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}

