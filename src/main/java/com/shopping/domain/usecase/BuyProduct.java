package com.shopping.domain.usecase;


import com.shopping.domain.ShoppingCart;
import com.shopping.domain.ShoppingCarts;

public class BuyProduct {

    private final ShoppingCarts shoppingCarts;

    public BuyProduct(ShoppingCarts shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }

    // 1
    public double calculatePrice() {
        return 0;
//        ShoppingCart shoppingCart = shoppingCarts.getByUserId(1);
//
//        return shoppingCart.calculateTotalPriceOfProducts();

//        return shoppingCarts.getProduct()
//                .stream().mapToDouble(Product::calculateTotalPrice).sum();
//    }
    }
}
