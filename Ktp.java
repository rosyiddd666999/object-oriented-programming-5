public class Ktp implements InterfaceUmur {
  int nik;
  String nama;
  String jenisKelamin;
  String alamat;
  private int umur;

  public Ktp(int umur) {
      this.umur = umur;
  }

  @Override
  public int syaratUmur() {     
      int umurYangMemenuhi = 17;
      if (umur >= umurYangMemenuhi) {
          return umur;
      }
      else {
        System.out.println("umur tidak memenuhi");
      }
      return 0;
  }
}
