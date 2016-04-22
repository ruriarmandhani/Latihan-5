package mainbukutamu;
import java.util.Scanner;
public class MainBukuTamu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        String nama, no;
        System.out.print("Masukkan Banyak Tamu : ");
        int jml = input.nextInt();
        BukuTamu tamu[] = new BukuTamu[jml];
        for(int a=0; a<jml; a++){
            System.out.print("Masukkan Nama   : ");
            nama = in.nextLine();
            System.out.print("Masukkan No. HP : ");
            no = in.nextLine();
            tamu[a]=new BukuTamu(nama,no);
        }
        System.out.println("---------------------------------");
        System.out.println("\tDaftar Tamu");
        System.out.println("---------------------------------");
        System.out.printf("%-3s %-15s %-12s \n","No","Nama","No.Hp");
        for(int b=0; b<jml; b++){
            System.out.printf("%-3d %-15s %-12s \n",(b+1),tamu[b].getNamaTamu(),tamu[b].getNomorTelp());
        }
        System.out.println("---------------------------------");
        System.out.println("Jumlah Tamu : "+BukuTamu.getJumlah());
        System.out.println("---------------------------------");
    }
}