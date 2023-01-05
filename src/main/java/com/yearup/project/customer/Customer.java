package com.yearup.project.customer;


public class Customer {

    private final String customerId;
    private final String alias;
    private final String displayName;

    public Customer(final String id,
                  final String alias,
                  final String displayName) {
        this.customerId = id;
        this.alias = alias;
        this.displayName = displayName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getAlias() {
        return alias;
    }

    public String getDisplayName() {
        return displayName;
    }
}
