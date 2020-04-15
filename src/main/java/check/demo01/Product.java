package check.demo01;

import lombok.Data;

@Data
public class Product {
    private String id;

    private String productName;

    private double productPrice;

    public Product(String id, String productName, double productPrice) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
