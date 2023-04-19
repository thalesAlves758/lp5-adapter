import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ProductServiceTest {
    @Test
    void shouldCreateProduct() {
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);

        productService.addProduct("Camisa", 109.99d);

        List<Product> productList = productService.getAllProducts();

        assertEquals(1, productList.size());
        assertEquals("Camisa", productList.get(0).getName());
        assertEquals(109.99d, productList.get(0).getPrice());
    }

    @Test
    void shouldReturnIntValue() {
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);

        productService.addProduct("Camisa", 109.99d);

        List<Product> productList = productService.getAllProducts();

        assertEquals(10999, productList.get(0).getStoredPrice());
    }
}
