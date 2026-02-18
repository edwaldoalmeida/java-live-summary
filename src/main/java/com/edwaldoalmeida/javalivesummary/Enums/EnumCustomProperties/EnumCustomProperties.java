package com.edwaldoalmeida.javalivesummary.Enums.EnumCustomProperties;

public class EnumCustomProperties {
    public static void main(String[] args) {
        PaymentMethod method = PaymentMethod.CREDIT_CARD;
        System.out.println(method.getDisplayName() + " fee: " + method.getProcessingFee());

        System.exit(1);
    }
}
