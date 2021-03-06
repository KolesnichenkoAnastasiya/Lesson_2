package ru.geekbrains.persist.Product;

public class Product {
    private Long id;
    private String title;
    private Float cost;

    public Product(Long id, String title, Float cost) {
        this.id =id;
        this.title = title;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public void changePrice (Float delta){
        this.cost = cost + delta;
    }

    @Override
    public String toString() {
        return String.format("\n Product {id = %-2s | name = %-15s | price = %-8s}" , id, title, cost);
    }
}
