
package pkg22205015.pbo.lat54;
//
// * Nama         : Ahmad Nurfaqih
// * Nim          : 22205015
// * prodi        : Teknik Informatia
// * Deskripsi    : Koordinat

class Koordinat {
    
    protected int x;
    protected int y;
    
    public Koordinat(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;
    }
}

class WarnaKoordinat extends Koordinat{
    
    public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna){
        super(x,y);
        this.namaWarna = namaWarna;
    }
    
    public String getNamaWarna(){
        return namaWarna;
    }
    
    public void setNamaWarna(String namaWarna){
        this.namaWarna = namaWarna;
    }
}

public class PBOLAT54 {

    public static void main(String[] args) {
        
        System.out.println("===LATIHAN 54===");
        WarnaKoordinat oo = new WarnaKoordinat(10,4,"Jingga");
        
        System.out.println("Warna koordinat : " + oo.getNamaWarna());
        System.out.println("Koordinat sumbu x : " + oo.getX() + ", y : " + oo.getY());

    }
    
}
