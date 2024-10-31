public class KartuKeluarga implements InterfaceUmur {
    int no;
    String kepalaKeluarga;
    String alamat;
    int kodePos;
    int umur;

    public KartuKeluarga(int umur) {
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
