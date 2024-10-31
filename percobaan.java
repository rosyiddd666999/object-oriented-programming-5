public class percobaan {
  static void MyMethod(boolean status) {    
      if (status) {
          System.out.println("Sudah");
      } else {
          System.out.println("Belum");
      }
  }

  static int myMethod(int x) {
    return 5 + x;
  }

  static void MyKTP() {
      Ktp myKtp = new Ktp(20); 
      InterfaceUmur umur = myKtp;

      myKtp.nik = 97334545;
      myKtp.nama = "Jamet";
      myKtp.jenisKelamin = "Laki-laki";
      myKtp.alamat = "Ponorogo";

      int umurKTP = umur.syaratUmur();

      System.out.println(
          "\nNIK : " + myKtp.nik
          + "\nNama : " + myKtp.nama
          + "\nUmur : " + umurKTP
          + "\nJenis Kelamin : " + myKtp.jenisKelamin
          + "\nAlamat : " + myKtp.alamat
      );
  }
  
  static void MyKartuKeluarga() {
      KartuKeluarga myKartuKeluarga = new KartuKeluarga(15);
      InterfaceUmur umur = myKartuKeluarga;

      myKartuKeluarga.kepalaKeluarga = "Tono";
      myKartuKeluarga.alamat = "Ponorogo";
      myKartuKeluarga.kodePos = 2;

      int umurKK = umur.syaratUmur();

      System.out.println(
          "Nama Kepala Keluarga: " + myKartuKeluarga.kepalaKeluarga
          + "\nAlamat: " + myKartuKeluarga.alamat
          + "\nKode Pos: " + myKartuKeluarga.kodePos
          + "\nUmur: " + umurKK
      );
  }

  public static void main(String[] args) {
      String hello = "Hello ";

      for (int i = 0; i < 5; i++) {
          System.out.println(hello + i);
      }

      System.out.println("\nSudah Menikah :");
      MyMethod(false);

      MyKTP();
      MyKartuKeluarga();
      System.out.println(myMethod(3));
  }
}
