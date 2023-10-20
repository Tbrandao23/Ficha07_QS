import org.example.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductTest {
    private Product product1;
    private Product product2;

    @Before
    public void setUp() {
        product1 = new Product("Papel", 0.10);
        product2 = new Product("Caneta", 0.50);
    }

    @Test
    public void testGetTitle() {
        assertEquals("Item: ", product1.getTitle());
    }

    @Test
    public void testGetPrice() {
        assertEquals(0.10, product1.getPrice(), 0.001);
    }

    @Test
    public void testEquals() {
        Product product3 = new Product("Item 1", 30.0);
        Product product4 = new Product("Item 2", 20.0);
        assertTrue(product1.equals(product3));
        assertTrue(product2.equals(product4));
        assertFalse(product1.equals(product2));
    }
}

