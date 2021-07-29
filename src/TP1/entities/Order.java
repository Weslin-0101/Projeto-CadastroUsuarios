package TP1.entities;

import java.util.ArrayList;
import java.util.List;

// Classe de controller responsável para adicionar, remover, atualizar e buscar os produtos
public class Order {

    // Instanciação da classe de produtos e da ArrayList
    private Product product;
    List<Product> products = new ArrayList<>();


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addItem(Product product) {
        if (!products.contains(product)) {
            products.add(product);
        } else {
            System.out.println("===================================");
            System.out.println("AVISO: Produto já cadastrado!!!");
            System.out.println("===================================");
        }
    }

    public void removeItem(Product product) {
        products.remove(product);
    }

    public void getAllProducts(Product product) {
        for (Product p : products) {
            System.out.println("============================");
            System.out.println(p);
            System.out.println("============================");
            System.out.println();
        }
    }

    public void searchProduct(String name) {
        // Variável booleana necessária para que possa verificar caso tenha encontrado ou não o nome do produto
        boolean found = false;
        Product product;
        for (Product value : products) { // Foreach para percorrer a lista products
            product = value;
            if (product.getName().equals(name)) {
                System.out.println(product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("====================================");
            System.out.println("Produto não encontrado!");
            System.out.println("====================================");
        }
    }

    public void updateProduct(String name, String newName, String description, Integer stockQuantity, Double price, Double porcent) {
        // Variável booleana novamente necessária para que faça a verificação
        boolean found = false;

        for (Product obj : products) {
            if (obj.getName().equals(name)) {
                obj.setName(newName);
                obj.setDescription(description);
                obj.setStockQuantity(stockQuantity);
                obj.setPrice(price);
                obj.setPorcent(porcent);

                found = true;
            }
        }

        if(!found) {
            System.out.println("====================================");
            System.out.println("AVISO: Produto não encontrado!");
            System.out.println("====================================");
        } else {
            System.out.println("====================================");
            System.out.println("Dados do produto atualizados com sucesso!!");
            System.out.println("====================================");
        }
    }

    // Método para poder realizar a subtração do estoque de produto
    public void stockCalc(String productName, int qntd) {

        for (Product p : products) {
            if (p.getName().equals(productName)) {
                int stock = p.getStockQuantity() - qntd;
                if (stock == 0) {
                    System.out.println("Venda concluída!!");
                    System.out.println("O produto esgotou! Será removido da lista de produtos");
                    removeItem(product);
                } else {
                    p.setStockQuantity(stock);
                    System.out.println(p);
                }
            }
        }
    }
}
