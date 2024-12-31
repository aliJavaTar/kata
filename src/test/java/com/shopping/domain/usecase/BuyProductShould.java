package com.shopping.domain.usecase;

import com.shopping.domain.Inventory;
import com.shopping.domain.Product;
import com.shopping.domain.ShoppingCarts;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

class BuyProductShould {
//    private Inventory inventory;
//    private ShoppingCarts shoppingCarts;
//
//    @BeforeEach
//    void setUp() {
//        inventory = Mockito.mock(Inventory.class);
//        shoppingCarts = Mockito.mock(ShoppingCarts.class);
//    }


    @Test
    void calculatePriceOfProduct() {
        // product -- > ShoppingCart
        // ShoppingCart --> list product

        var shoppingCarts = mock(ShoppingCarts.class);

        var e1 = new Product(1, 5, .1);
        // 5.5
        var e2 = new Product(2, 4, .5);
        // 6
        List<Product> products = List.of(e1, e2);

        when(shoppingCarts.getProduct()).thenReturn(products);

        var buyProduct = new BuyProduct(shoppingCarts);

        double totalPrice = buyProduct.calculatePrice();

        Assertions.assertThat(totalPrice).isEqualTo(11.5);

    }

//    @Test
//    void see_list_of_products() {
//
//        List<Product> productList = List.of(new Product());
//        when(inventory.getAll()).thenReturn(productList);
//        Assertions.assertThat(inventory.getAll().size()).isEqualTo(1);
//    }
//
//    @Test
//    void see_add_to_shopping_cart() {
//
//        List<Integer> ides = List.of(1, 2, 3);
//        var buyProduct = new BuyProduct(shoppingCarts, inventory);
//
//        inventory.getAll();
//
//        buyProduct.applyProduct(ides);
//
//        verify(shoppingCarts, times(1)).applyProduct(anyList());
//
//
//        // apply
//    }


}