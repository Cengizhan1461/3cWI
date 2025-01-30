package at.cengo.projects.ObjektOrientierung2.car;


//Der Hersteller hat einen Namen und ein Herkunftsland.
//Jeder Hersteller gibt einen gewissen Rabatt. Dieser ist unterschiedlich je nach Hersteller.
//Der Rabatt wird in Prozent angegeben.
public class Manufacturer {
    private String name;
    private String country;
    private int discount;


    public Manufacturer(String name, String country, int discount) {
        this.name = name;
        this.country = country;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

}
