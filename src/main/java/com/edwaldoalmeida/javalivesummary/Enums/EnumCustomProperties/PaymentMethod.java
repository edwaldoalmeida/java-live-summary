package com.edwaldoalmeida.javalivesummary.Enums.EnumCustomProperties;

public enum PaymentMethod {
    CREDIT_CARD("Credit Card", 2.5),
    DEBIT_CARD("Debit Card", 1.5),
    PAYPAL("PayPal", 3.0),
    CASH("Cash", 0.0);

    private final String displayName;
    private final double processingFee;

    PaymentMethod(String displayName, double processingFee) {
        this.displayName = displayName;
        this.processingFee = processingFee;
    }

    public String getDisplayName() { return displayName; }
    public double getProcessingFee() { return processingFee; }
}
