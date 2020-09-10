/*3. Sınıf */
public class Product {

    /* Field (Özellikler) */
    
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stock;
    private String _renk;
    private String _kod;
    
    /* Getter */
    public String getProductName() { //Ürünü get et
        return _name;
    }
    public int getId() {
        return _id;
    }
    public String getDescription() {
        return _description;
    }
    public double getPrice() {
        return _price;
    }
    public int getStock() {
        return _stock;
    }
    public String getRenk() {
        return _renk;
    }
    public String getkod() {
        return this._name.substring(0, 5) + this._id;
    }
    /* !!! Getter !!! */

    /* Setter */
    public void setProductName(String setName) { // Ürünü set et
        this._name = setName; //this. sınıfta ki verilerden almayı sağlar
    }
    public void setProductDescription(String setDescription) { // Ürünü set et
        this._description = setDescription; //this. sınıfta ki verilerden almayı sağlar
    }
    public void setProductId(int setId) { // Ürünü set et
        this._id = setId; //this. sınıfta ki verilerden almayı sağlar
    }
    public void setProductRenk(String setRenk) { // Ürünü set et
        this._renk = setRenk; //this. sınıfta ki verilerden almayı sağlar
    }
    public void setProductPrice(double setPrice) { // Ürünü set et
        this._price = setPrice; //this. sınıfta ki verilerden almayı sağlar
    }
    public void setProductStock(int setStock) { // Ürünü set et
        this._stock = setStock; //this. sınıfta ki verilerden almayı sağlar
    }
    /* !!! Setter !!! */
}
