package com.shopify.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ShopifyError implements Serializable {
    private static final long serialVersionUID = 3300726464293447080L;

    @JsonProperty
    private Map<String, List<String>> errors;

    public Map<String, List<String>> getErrors() {
        return Optional.ofNullable( errors ).orElse(Collections.emptyMap());
    }

    public void setErrors(Map<String, List<String>> errors) {
        this.errors = errors;
    }
}
