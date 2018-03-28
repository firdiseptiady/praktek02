package praktek02;

public class Rectangle {
    Integer Harga;
    Integer Jumlah_Barang;

    public Rectangle() {
        Harga = 800000;
        Jumlah_Barang = 7;
    }
    
    void cetakInfo() {
        System.out.println("=====================");
        System.out.println("Harga :"+Harga);
        System.out.println("Jumlah_Barang :"+Jumlah_Barang);
        System.out.println("=====================");
    }
     
    Integer hitungtotal(){
        Integer total;
        total = Harga*Jumlah_Barang;
        return total;
        
    }
        void cetaktotal(){
            System.out.println("totalnya adalah: "+hitungtotal());
            
        }
   }
