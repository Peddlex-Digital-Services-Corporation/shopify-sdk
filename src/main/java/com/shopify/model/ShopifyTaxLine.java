package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@JsonIgnoreProperties( ignoreUnknown = true )
public class ShopifyTaxLine {

	private String title;
	private BigDecimal price;
	private BigDecimal rate;

	@JsonProperty( "price_set" )
	private PriceSet priceSet;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public PriceSet getPriceSet() {
		return priceSet;
	}

	public void setPriceSet(PriceSet priceSet) {
		this.priceSet = priceSet;
	}
}
