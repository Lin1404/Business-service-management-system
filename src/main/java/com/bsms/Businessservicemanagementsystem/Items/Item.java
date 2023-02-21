package com.bsms.Businessservicemanagementsystem.Items;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Item {
    private @Id @GeneratedValue long id;
    private String userName;
    private String itemName;
    private double itemPrice;

    Item(){}

    Item(long id, String userName, String itemName, long itemPrice){
        this.id = id;
        this.userName = userName;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public Long getId(){
        return this.id;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getItemName(){
        return this.itemName;
    }

    public double getItemPrice(){
        return this.itemPrice;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
        return true;

        if(!(o instanceof Item))
        return false;

        Item item = (Item) o;
        return Objects.equals(this.id, item.id) 
        && Objects.equals(this.userName, item.userName)
        && Objects.equals(this.itemName, item.itemName)
        && Objects.equals(this.itemPrice, item.itemPrice);
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.id, this.userName, this.itemName, this.itemPrice);
    }

    @Override
    public String toString() {
      return "Item{" + "id=" + this.id + ", userName='" + this.userName + '\'' + ", itemName='" + this.itemName + '\'' + ", itemPrice='" + this.itemPrice + '\'' + '}';
    }

}
