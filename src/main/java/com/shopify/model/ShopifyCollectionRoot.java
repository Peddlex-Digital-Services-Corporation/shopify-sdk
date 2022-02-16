package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShopifyCollectionRoot {

    @JsonProperty
    private ShopifyCustomCollection collection;

    public ShopifyCustomCollection getCollection() {
        return collection;
    }

    public void setCollection(ShopifyCustomCollection collection) {
        this.collection = collection;
    }
}
