package com.razorpay.apiimplemenctionjava;

import java.util.List;

public class MyData {
    private final int limit;
    private final List<Product> products;
    private final int skip;
    private final int total;

    public MyData(int limit, List<Product> products, int skip, int total) {
        this.limit = limit;
        this.products = products;
        this.skip = skip;
        this.total = total;
    }

    public int getLimit() {
        return limit;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getSkip() {
        return skip;
    }

    public int getTotal() {
        return total;
    }
}
