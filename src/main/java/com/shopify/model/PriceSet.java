package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceSet {

    @JsonProperty("shop_money")
    private MoneyType shopMoney;

    @JsonProperty("present_money")
    private MoneyType presentMoney;

    public MoneyType getShopMoney() {
        return shopMoney;
    }

    public void setShopMoney(MoneyType shopMoney) {
        this.shopMoney = shopMoney;
    }

    public MoneyType getPresentMoney() {
        return presentMoney;
    }

    public void setPresentMoney(MoneyType presentMoney) {
        this.presentMoney = presentMoney;
    }

    public static class MoneyType {
        private String amount;

        @JsonProperty("currency_code")
        private String currencyCode;

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }
    }
}
