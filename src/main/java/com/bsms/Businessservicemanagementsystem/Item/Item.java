package com.bsms.Businessservicemanagementsystem.Item;

public class Item {
    private Integer id;
    private String name;
    private Integer amount;
    private String provider;
    private Double price;

    public Item() {

    }

    public Item(
        Integer id,
        String name,
        Integer amount,
        String provider,
        Double price
    ){
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.provider = provider;
        this.price = price;
    }

    public Item(
        String name,
        Integer amount,
        String provider,
        Double price
    ){
        this.name = name;
        this.amount = amount;
        this.provider = provider;
        this.price = price;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Integer getAmount(){
        return amount;
    }
    public void setAmount(Integer amount){
        this.amount = amount;
    }

    public String getProvider(){
        return provider;
    }
    public void setProvider(String provider){
        this.provider = provider;
    }

    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    
    @Override
    public String toString(){
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", provider='" + provider + '\'' +
                ", price='" + price + '\'' +
                '}';

    }
}