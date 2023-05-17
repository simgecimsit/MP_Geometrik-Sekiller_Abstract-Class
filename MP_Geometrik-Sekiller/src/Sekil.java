
public abstract class Sekil {
    
    //Özellik
    private String isim;
    
    //Constructor
    public Sekil(String isim) {
        this.isim = isim;
    }
    
    //Abstract Metod
    
    abstract void alanHesapla();
    
    //Getter Setter

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
}
