package check.demo01;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SportStoreService {
    private List<Product> productList = new ArrayList<>(Arrays.asList(
            new Product("0001", "aaa", 200.00),
            new Product("0002", "bbb", 399.75),
            new Product("0003", "ccc", 555.50)
    ));

    public List<Product> retrieveProduct() {
        return productList;
    }

    public void createProduct(Product product) {
        productList.add(product);
    }

    public void deleteProduct(String id) {
        productList.removeIf(product -> product.getId().equals(id));
    }

    public void updateProduct(Product product, String id) {
        int counter = 0;
        for (Product product1 : productList) {
            if (product1.getId().equals(id)) {
                productList.set(counter, product);
            }
            counter++;
        }
    }
}