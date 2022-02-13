package com.shopify.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import com.shopify.model.adapters.DateTimeAdapter;
import com.shopify.model.adapters.MetafieldValueTypeAdapter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metafield {

	private String id;
	private String key;
	private String value;

	@JsonProperty("value_type")
	private MetafieldValueType valueType;

	private String namespace;

	@JsonProperty("owner_id")
	private String ownerId;

	@JsonProperty("owner_resource")
	private String ownerResource;

	@JsonProperty("created_at")
	private Object createdAt;

	@JsonProperty("updated_at")
	private Object updatedAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public MetafieldValueType getValueType() {
		return valueType;
	}

	public void setValueType(MetafieldValueType valueType) {
		this.valueType = valueType;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerResource() {
		return ownerResource;
	}

	public void setOwnerResource(String ownerResource) {
		this.ownerResource = ownerResource;
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

}
