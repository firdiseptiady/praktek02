package praktek02;

public class Rectangle {
    Integer Harga;
    Integer Jumlah_Barang;
    
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
