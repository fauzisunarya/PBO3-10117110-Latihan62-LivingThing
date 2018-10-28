

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Makhluk Hidup Dengan Menggunakan Konsep OOP Abstrak
 */

package pbo3.pkg10117110.latihan62.livingthing;


public class PBO310117110Latihan62LivingThing {

    public static void main(String[] args) {
        
        Human obj = new Human();
        obj.setNama("Rizki Adam Kurniawan");
        System.out.print(obj.getNama()+" ");
        obj.walk("");
        System.out.print(obj.getNama()+" ");
        obj.breath("");
        System.out.print(obj.getNama()+" ");
        obj.eat("");

    }
    
}
