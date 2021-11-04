package com.shopify.model;

import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyFulfillment {

	public enum Status {

		PENDING("pending"), OPEN("open"), SUCCESS("success"), CANCELLED("cancelled"), ERROR("error"),
		FAILURE("failure");

		static final String NO_MATCHING_ENUMS_ERROR_MESSAGE = "No matching enum found for status: %s";
		private final String value;

		private Status(final String value) {
			this.value = value;
		}

		public static Status toEnum(final String value) {
			if (PENDING.toString().equals(value)) {
				return Status.PENDING;
			} else if (OPEN.toString().equals(value)) {
				return Status.OPEN;
			} else if (SUCCESS.toString().equals(value)) {
				return Status.SUCCESS;
			} else if (CANCELLED.toString().equals(value)) {
				return Status.CANCELLED;
			} else if (ERROR.toString().equals(value)) {
				return Status.ERROR;
			} else if (FAILURE.toString().equals(value)) {
				return Status.FAILURE;
			}

			throw new IllegalArgumentException(String.format(NO_MATCHING_ENUMS_ERROR_MESSAGE, value));
		}

		@Override
		public String toString() {
			return value;
		}
	}

	private String id;
	@JsonProperty("order_id")
	private String orderId;
	private String status;
	@JsonProperty("created_at")
	private Object createdAt;
	@JsonProperty("updated_at")
	private Object updatedAt;
	@JsonProperty("tracking_company")
	private String trackingCompany;
	@JsonProperty("tracking_number")
	private String trackingNumber;
	@JsonProperty("notify_customer")
	private boolean notifyCustomer;
	@JsonProperty("line_items")
	private List<ShopifyLineItem> lineItems = new LinkedList<>();
	@JsonProperty("tracking_url")
	private String trackingUrl;
	@JsonProperty("tracking_urls")
	private List<String> trackingUrls = new LinkedList<>();
	@JsonProperty("location_id")
	private String locationId;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(final String orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public Object getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Object createdAt) {
		this.createdAt = createdAt;
	}

	public Object getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Object updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getTrackingCompany() {
		return trackingCompany;
	}

	public void setTrackingCompany(final String trackingCompany) {
		this.trackingCompany = trackingCompany;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(final String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getTrackingUrl() {
		return trackingUrl;
	}

	public void setTrackingUrl(final String trackingUrl) {
		this.trackingUrl = trackingUrl;
	}

	public List<String> getTrackingUrls() {
		return trackingUrls;
	}

	public void setTrackingUrls(final List<String> trackingUrls) {
		this.trackingUrls = trackingUrls;
	}

	public boolean isNotifyCustomer() {
		return notifyCustomer;
	}

	public void setNotifyCustomer(final boolean notifyCustomer) {
		this.notifyCustomer = notifyCustomer;
	}

	public List<ShopifyLineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(final List<ShopifyLineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(final String locationId) {
		this.locationId = locationId;
	}

}
