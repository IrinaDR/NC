package ru.ncedu.purchasebot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shops {
    @Id
    @Column(length = 50)
    private String adress;
    @Column(nullable = false, length = 50)
    private String product_handler;

    public Shops() {
    }

    public Shops(String adress, String product_handler) {
        this.adress = adress;
        this.product_handler = product_handler;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getProduct_handler() {
        return product_handler;
    }

    public void setProduct_handler(String product_handler) {
        this.product_handler = product_handler;
    }

    @Override
    public String toString() {
        return "Shops{" +
                "adress='" + adress + '\'' +
                ", product_handler='" + product_handler + '\'' +
                '}';
    }
}
