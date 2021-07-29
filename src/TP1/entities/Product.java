package TP1.entities;

// Classe de entidades do produto onde estão os atributos e getters e setters
public class Product {

    // Atributos
    private String name;
    private String description;
    private Integer stockQuantity;
    private Double price;
    private Double porcent;

    // Logo abaixo os constructors default e sobrecarregado
    public Product() {
    }

    public Product(String name, String description, Integer stockQuantity, Double price, Double porcent) {
        this.name = name;
        this.description = description;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.porcent = porcent;
    }

    // Getters and setters de cada atributo
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPorcent() {
        return porcent;
    }

    public void setPorcent(Double porcent) {
        this.porcent = porcent;
    }

    // Override para não sobrepor
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto: ");
        sb.append(name + "\n");
        sb.append("Descrição: ");
        sb.append(description + "\n");
        sb.append("Preço: $");
        sb.append(String.format("%.2f", price) + "\n");
        sb.append("Quantidade em estoque: ");
        sb.append(stockQuantity + "\n");
        sb.append("Porcentagem de lucro: ");
        sb.append(porcent + "%");
        return sb.toString();
    }
}
