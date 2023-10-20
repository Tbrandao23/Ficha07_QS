import org.example.Product;
import org.example.ShoppingCart;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
    private ShoppingCart cart;
    private Product product1;
    private Product product2;

    @Before
    public void setUp() {
        cart = new ShoppingCart();
        product1 = new Product("Papel", 0.02);
        product2 = new Product("Caneta", 20.30);
    }

    @Test
    public void testAddItem() {
        cart.addItem(product1);
        cart.addItem(product2);
        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        cart.addItem(product1);
        cart.addItem(product2);
        assertTrue(cart.removeItem(product1));
        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testRemoveItemNotInCart() {
        assertFalse(cart.removeItem(product1));
    }

    @Test
    public void testGetBalance() {
        cart.addItem(product1);
        cart.addItem(product2);
        assertEquals(30.0, cart.getBalance(), 0.001);
    }

    @Test
    public void testClear() {
        cart.addItem(product1);
        cart.addItem(product2);
        cart.empty();
        assertEquals(0, cart.getItemCount());
    }
}
