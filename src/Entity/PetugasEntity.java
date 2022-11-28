package Entity;

public class PetugasEntity {
    String user,psw,nama,asal;

    public PetugasEntity(){
        this.user = "desy";
        this.psw = "111";
        this.nama = "tata";
        this.asal = "sby";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }
}

