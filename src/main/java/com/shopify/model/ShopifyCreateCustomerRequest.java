package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ShopifyCreateCustomerRequest {

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    private String email;

    private String phone;

    private List<ShopifyAddress> addresses;

    private String password;

    @JsonProperty("password_confirmation")
    private String passwordConfirmation;

    @JsonProperty("verified_email")
    private boolean verifiedEmail;

    @JsonProperty("send_email_welcome")
    private boolean sendEmailWelcome;

    private ShopifyCreateCustomerRequest(final Steps steps) {
        this.firstName = steps.firstName;
        this.lastName = steps.lastName;
        this.email = steps.email;
        this.phone = steps.phone;
        this.password = steps.password;
        this.passwordConfirmation = steps.password;
        this.verifiedEmail = true;
        this.sendEmailWelcome = false;
    }

    public static interface BuildStep {
        ShopifyCreateCustomerRequest build();
    }

    public static interface FirstNameStep {
        BuildStep withFirstName(final String firstName);
    }

    public static interface LastNameStep {
        FirstNameStep withLastName(final String lastName);
    }

    public static interface EmailStep {
        LastNameStep withEmail(final String email);
    }

    public static interface PhoneStep {
        EmailStep withPhone(final String phone);
    }

    public static interface PasswordStep {
        PhoneStep withPassword(final String password);
    }

    public static PasswordStep newBuilder() {
        return new Steps();
    }

    private static class Steps implements FirstNameStep, LastNameStep, EmailStep, PhoneStep, PasswordStep, BuildStep {
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String password;

        @Override
        public ShopifyCreateCustomerRequest build() {
            return new ShopifyCreateCustomerRequest( this );
        }

        @Override
        public BuildStep withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @Override
        public FirstNameStep withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        public LastNameStep withEmail(String email) {
            this.email = email;
            return this;
        }

        @Override
        public EmailStep withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        @Override
        public PhoneStep withPassword(String password) {
            this.password = password;
            return this;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<ShopifyAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<ShopifyAddress> addresses) {
        this.addresses = addresses;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    public boolean isVerifiedEmail() {
        return verifiedEmail;
    }

    public void setVerifiedEmail(boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
    }

    public boolean isSendEmailWelcome() {
        return sendEmailWelcome;
    }

    public void setSendEmailWelcome(boolean sendEmailWelcome) {
        this.sendEmailWelcome = sendEmailWelcome;
    }
}
