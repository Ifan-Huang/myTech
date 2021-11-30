package tech.codeforc.example.orm.entity;

/**
 * Author: Ifan·Huang
 * Description: 产品
 **/
public class Product {

    private String productName;

    private String price;

    private String category;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
