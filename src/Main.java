import java.util.ArrayList;
import java.util.Scanner;
import Entity.*;

public class Main {

    ArrayList<StaffApotekEntity> obat = new ArrayList<StaffApotekEntity>();
    PetugasEntity ptgs = new PetugasEntity();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Main ptugas = new Main();
        Main obaat = new Main();

        ptugas.Admin();

        int pilih;

        do {
            System.out.println("+===+ STUDY KASUS APOTEK +===+");
            System.out.println("1. Data Petugas");
            System.out.println("2. Data Obat");
            System.out.println("3. Tampil Data Petugas");
            System.out.println("4. Tampil Data Obat");
            System.out.println("5. Hapus Data Obat");
            System.out.println("6. Edit Data Obat");
            System.out.println();
            System.out.print(" Pilih :");
            pilih = input.nextInt();

            System.out.println(" ");

            switch (pilih) {
                case 1:
                    ptugas.logpet();
                    break;
                case 2:
                    obaat.TambahObat();
                    break;
                case 3 :
                    ptugas.Tampilpetugas();
                    break;
                case 4 :
                    obaat.TampilObat();
                    break;
                case 5 :
                    obaat.HapusData();
                    break;
                case 6 :
                    obaat.Editdata();
                    break;
                default:
                    System.out.println(" tidak ada di menu ");
                    break;
            }
            System.out.print(" Apakah ingin Lanjut : ");
            pilih = input.nextInt();
            System.out.println(" ");

        }while (pilih==1);
    }

    // PetugasEntity
    public void Admin(){
        Scanner input = new Scanner(System.in);

        System.out.println("+===+ INPUT LOGIN STAFF ADMIN +===+ ");
        System.out.print(" Username : ");
        String user = input.next();
        System.out.print(" Password : ");
        String psw= input.next();

        System.out.println(" ");
        System.out.println("+===+ LOGIN STAFF ADMIN +===+ ");
        System.out.println(" Username : "+ user);
        System.out.println(" Password : " + psw);

        if((psw.equals("111")) && (user.equals("desy"))){
            System.out.println(" Login Successful");
            System.out.println(" ");
        }
        else{
            System.out.println(" Login Failed");
        }
    }

    public void logpet(){
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("+===+ INPUT PETUGAS +==+");
        System.out.print(" Nama : ");
        String nama = input.next();
        System.out.print(" Asal : ");
        String asal = input.next();

        if ((nama.equals("tata")) && (asal.equals("sby"))) {
            System.out.println(" Login Successful");
            System.out.println(" ");
        }
        else {
            System.out.println(" Login Failed");
        }
    }

    public void Tampilpetugas(){
        System.out.println(" ");
        System.out.println("+===+ LOGIN PETUGAS +===+ ");
        System.out.println(" Nama : "+ ptgs.getNama());
        System.out.println(" Asal : " + ptgs.getAsal());
        System.out.println(" ");
    }


    //StaffApotekEntity

    public void TambahObat(){
        Scanner input = new Scanner(System.in);

        for(int i=0; i<2;i++){
            System.out.println(" ");
            System.out.println("+===+ INPUT DATA OBAT +==+");
            System.out.print(" Nama Obat : ");
            String namaobat = input.next();
            System.out.print(" Jenis Obat : ");
            String jenisobat = input.next();
            System.out.print(" Harga : ");
            String harga = input.next();
            System.out.println(" ");
            obat.add(new StaffApotekEntity(namaobat, jenisobat, harga));
        }
    }

    public void TampilObat(){
        for(StaffApotekEntity data:obat) {
            System.out.println("+===+ DATA OBAT +==+");
            System.out.println(" Nama Obat : " + data.getNamaobat());
            System.out.println(" Jenis Obat : " + data.getJenisobat());
            System.out.println(" Harga : " + data.getHarga());
            System.out.println(" ");
        }
    }

    public void HapusData(){
        int index;
        System.out.print(" Pilih index yang di hapus : ");
        index=input.nextInt();

        for(StaffApotekEntity data:obat){
            System.out.println(" index ke-"+index);
            obat.remove(index);
        }
    }

    public void Editdata(){
        int index;
        System.out.print(" Pilih index yang di edit : ");
        index=input.nextInt();

            System.out.println(" ");
            System.out.println("+===+ INPUT DATA OBAT +==+");
            System.out.println(" index ke-" + index);
            System.out.print(" Nama Obat : ");
            String namaobat = input.next();
            System.out.print(" Jenis Obat : ");
            String jenisobat = input.next();
            System.out.print(" Harga : ");
            String harga = input.next();
            System.out.println(" ");


        for(StaffApotekEntity data:obat){
            obat.set(index,new StaffApotekEntity(namaobat,jenisobat,harga));
        }
    }
}

