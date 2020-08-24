package br.com.codenation.paymentmethods;

public enum PaymentMethod {

    CASH(new CashImpl()), DEBIT_CARD(new DebitCardImpl()), CREDIT_CARD(new CreditCardImpl()), TRANSFER(new TransferImpl());

    private PriceStrategy priceStrategy;

    PaymentMethod(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public PriceStrategy getPaymentStrategy() {
        return priceStrategy;
    }
}