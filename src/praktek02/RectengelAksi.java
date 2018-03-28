package praktek02;

public class RectengelAksi {
    public static void main(String[] args) {
        
        Rectangle rl = new Rectangle();
        rl.Harga = 500000;
        rl.Jumlah_Barang = 3;
        
        rl.cetakInfo();
        System.out.println("total Rectangle = "+rl.hitungtotal());
        
    }
}
