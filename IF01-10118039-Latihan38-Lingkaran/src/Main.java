/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk mencari jari-jari,luas dan keliling lingkaran   
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lingkaran bulat = new Lingkaran();
       
        System.out.println("======Perhitungan Lingkaran======");
        bulat.validasi();
        bulat.tampil(bulat.diameter);
    }

}
