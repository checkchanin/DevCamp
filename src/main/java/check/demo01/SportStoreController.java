package check.demo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SportStoreController {

    @Autowired
    private SportStoreService SportStoreService;

    @RequestMapping("/api/products")
    public List<Product> getProduct() {
        return SportStoreService.retrieveProduct();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/products")
    public void createProduct(@RequestBody Product product) {
        SportStoreService.createProduct(product);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/api/product/{id}")
    public void deleteProduct(@PathVariable String id) {
        SportStoreService.deleteProduct(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/api/product/{id}")
    public void updateProduct(@PathVariable String id, @RequestBody Product product) {
        SportStoreService.updateProduct(product, id);
    }
}

