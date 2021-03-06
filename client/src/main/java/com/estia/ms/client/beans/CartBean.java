package com.estia.ms.client.beans;

import java.util.List;

public class CartBean {

    private Long id;

    private List<CartItemBean> products;

    public CartBean() {
    }

    public CartBean(Long id, List<CartItemBean> products) {
        this.id = id;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CartItemBean> getProducts() {
        return products;
    }

    public void addProduct(CartItemBean product) {
        this.products.add(product);
    }
}
