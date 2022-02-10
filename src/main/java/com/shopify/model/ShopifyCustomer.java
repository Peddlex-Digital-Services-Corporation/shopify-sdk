package com.shopify.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import com.shopify.model.adapters.DateTimeAdapter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyCustomer {

	private String id;
	private String email;

	@JsonProperty("accepts_marketing")
	private boolean acceptsMarketing;

	@JsonProperty("created_at")
	private Object createdAt;

	@JsonProperty("updated_at")
	private Object updatedAt;

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("last_name")
	private String lastname;

	private String phone;

	@JsonProperty("orders_count")
	private long ordersCount;

	private String state;

	@JsonProperty("total_spent")
	private BigDecimal totalSpent;

	private String note;

	@JsonProperty("last_order_id")
	private String lastOrderId;

	@JsonProperty("verified_email")
	private boolean verifiedEmail;

	@JsonProperty("multipass_identifier")
	private String multipassIdentifier;

	@JsonProperty("last_order_name")
	private String lastOrderName;

	private String currency;

	private List<ShopifyAddress> addresses;

	@JsonProperty("default_address")
	private ShopifyAddress defaultAddress;

	private List<ShopifyOrder> orders = new ArrayList<>();

	//custo fields
	private String middleName;
	private String gender;
	private String bio;
	private String instagramHandle;
	private String facebookUrl;
	private String twitterHandle;
	private String tiktokHandle;
	private String discordUrl;
	private String company;
	private String ethWalletAddress1;
	private String ethWalletAddress2;
	private String waxWalletAddress1;
	private String waxWalletAddress2;
	private String tezosWalletAddress1;
	private String tezosWalletAddress2;
	private String bscWalletAddress1;
	private String bscWalletAddress2;
	private String cardanoWalletAddress1;
	private String cardanoWalletAddress2;
	private String flowWalletAddress1;
	private String flowWalletAddress2;
	private String tronWalletAddress1;
	private String tronWalletAddress2;
	private String algorandWalletAddress1;
	private String algorandWalletAddress2;
	private String eosWalletAddress1;
	private String eosWalletAddress2;
	private String solanaWalletAddress1;
	private String solanaWalletAddress2;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAcceptsMarketing() {
		return acceptsMarketing;
	}

	public void setAcceptsMarketing(boolean acceptsMarketing) {
		this.acceptsMarketing = acceptsMarketing;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public long getOrdersCount() {
		return ordersCount;
	}

	public void setOrdersCount(long ordersCount) {
		this.ordersCount = ordersCount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(BigDecimal totalSpent) {
		this.totalSpent = totalSpent;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<ShopifyOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<ShopifyOrder> orders) {
		this.orders = orders;
	}

	public String getLastOrderId() {
		return lastOrderId;
	}

	public void setLastOrderId(String lastOrderId) {
		this.lastOrderId = lastOrderId;
	}

	public boolean isVerifiedEmail() {
		return verifiedEmail;
	}

	public void setVerifiedEmail(boolean verifiedEmail) {
		this.verifiedEmail = verifiedEmail;
	}

	public String getMultipassIdentifier() {
		return multipassIdentifier;
	}

	public void setMultipassIdentifier(String multipassIdentifier) {
		this.multipassIdentifier = multipassIdentifier;
	}

	public String getLastOrderName() {
		return lastOrderName;
	}

	public void setLastOrderName(String lastOrderName) {
		this.lastOrderName = lastOrderName;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<ShopifyAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<ShopifyAddress> addresses) {
		this.addresses = addresses;
	}

	public ShopifyAddress getDefaultAddress() {
		return defaultAddress;
	}

	public void setDefaultAddress(ShopifyAddress defaultAddress) {
		this.defaultAddress = defaultAddress;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getInstagramHandle() {
		return instagramHandle;
	}

	public void setInstagramHandle(String instagramHandle) {
		this.instagramHandle = instagramHandle;
	}

	public String getFacebookUrl() {
		return facebookUrl;
	}

	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}

	public String getTwitterHandle() {
		return twitterHandle;
	}

	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}

	public String getTiktokHandle() {
		return tiktokHandle;
	}

	public void setTiktokHandle(String tiktokHandle) {
		this.tiktokHandle = tiktokHandle;
	}

	public String getDiscordUrl() {
		return discordUrl;
	}

	public void setDiscordUrl(String discordUrl) {
		this.discordUrl = discordUrl;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEthWalletAddress1() {
		return ethWalletAddress1;
	}

	public void setEthWalletAddress1(String ethWalletAddress1) {
		this.ethWalletAddress1 = ethWalletAddress1;
	}

	public String getEthWalletAddress2() {
		return ethWalletAddress2;
	}

	public void setEthWalletAddress2(String ethWalletAddress2) {
		this.ethWalletAddress2 = ethWalletAddress2;
	}

	public String getWaxWalletAddress1() {
		return waxWalletAddress1;
	}

	public void setWaxWalletAddress1(String waxWalletAddress1) {
		this.waxWalletAddress1 = waxWalletAddress1;
	}

	public String getWaxWalletAddress2() {
		return waxWalletAddress2;
	}

	public void setWaxWalletAddress2(String waxWalletAddress2) {
		this.waxWalletAddress2 = waxWalletAddress2;
	}

	public String getTezosWalletAddress1() {
		return tezosWalletAddress1;
	}

	public void setTezosWalletAddress1(String tezosWalletAddress1) {
		this.tezosWalletAddress1 = tezosWalletAddress1;
	}

	public String getTezosWalletAddress2() {
		return tezosWalletAddress2;
	}

	public void setTezosWalletAddress2(String tezosWalletAddress2) {
		this.tezosWalletAddress2 = tezosWalletAddress2;
	}

	public String getBscWalletAddress1() {
		return bscWalletAddress1;
	}

	public void setBscWalletAddress1(String bscWalletAddress1) {
		this.bscWalletAddress1 = bscWalletAddress1;
	}

	public String getBscWalletAddress2() {
		return bscWalletAddress2;
	}

	public void setBscWalletAddress2(String bscWalletAddress2) {
		this.bscWalletAddress2 = bscWalletAddress2;
	}

	public String getCardanoWalletAddress1() {
		return cardanoWalletAddress1;
	}

	public void setCardanoWalletAddress1(String cardanoWalletAddress1) {
		this.cardanoWalletAddress1 = cardanoWalletAddress1;
	}

	public String getCardanoWalletAddress2() {
		return cardanoWalletAddress2;
	}

	public void setCardanoWalletAddress2(String cardanoWalletAddress2) {
		this.cardanoWalletAddress2 = cardanoWalletAddress2;
	}

	public String getFlowWalletAddress1() {
		return flowWalletAddress1;
	}

	public void setFlowWalletAddress1(String flowWalletAddress1) {
		this.flowWalletAddress1 = flowWalletAddress1;
	}

	public String getFlowWalletAddress2() {
		return flowWalletAddress2;
	}

	public void setFlowWalletAddress2(String flowWalletAddress2) {
		this.flowWalletAddress2 = flowWalletAddress2;
	}

	public String getTronWalletAddress1() {
		return tronWalletAddress1;
	}

	public void setTronWalletAddress1(String tronWalletAddress1) {
		this.tronWalletAddress1 = tronWalletAddress1;
	}

	public String getTronWalletAddress2() {
		return tronWalletAddress2;
	}

	public void setTronWalletAddress2(String tronWalletAddress2) {
		this.tronWalletAddress2 = tronWalletAddress2;
	}

	public String getAlgorandWalletAddress1() {
		return algorandWalletAddress1;
	}

	public void setAlgorandWalletAddress1(String algorandWalletAddress1) {
		this.algorandWalletAddress1 = algorandWalletAddress1;
	}

	public String getAlgorandWalletAddress2() {
		return algorandWalletAddress2;
	}

	public void setAlgorandWalletAddress2(String algorandWalletAddress2) {
		this.algorandWalletAddress2 = algorandWalletAddress2;
	}

	public String getEosWalletAddress1() {
		return eosWalletAddress1;
	}

	public void setEosWalletAddress1(String eosWalletAddress1) {
		this.eosWalletAddress1 = eosWalletAddress1;
	}

	public String getEosWalletAddress2() {
		return eosWalletAddress2;
	}

	public void setEosWalletAddress2(String eosWalletAddress2) {
		this.eosWalletAddress2 = eosWalletAddress2;
	}

	public String getSolanaWalletAddress1() {
		return solanaWalletAddress1;
	}

	public void setSolanaWalletAddress1(String solanaWalletAddress1) {
		this.solanaWalletAddress1 = solanaWalletAddress1;
	}

	public String getSolanaWalletAddress2() {
		return solanaWalletAddress2;
	}

	public void setSolanaWalletAddress2(String solanaWalletAddress2) {
		this.solanaWalletAddress2 = solanaWalletAddress2;
	}
}
