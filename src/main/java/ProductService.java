import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(String name, double price) {
        Product product = new Product(name, (int) (price * 100));
        productRepository.addProduct(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.getProducts();
    }
}
