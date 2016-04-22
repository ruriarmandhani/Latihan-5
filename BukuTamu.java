package mainbukutamu;
public class BukuTamu {
    private final String nama;
    private final String notelp;
    private static int jumlah=0;
    public BukuTamu(String na, String no){
        nama = na;
        notelp = no;
        jumlah++;
    }
    public static int getJumlah(){
        return jumlah;
    }
    public String getNamaTamu(){
        return nama;
    }
    public String getNomorTelp(){
        return notelp;
    }
}
