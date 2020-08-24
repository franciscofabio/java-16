package br.com.codenation.paymentmethods;

public class DebitCardImpl implements PriceStrategy{

    @Override
    public Double calculate(Double price) {
        return price * 0.95;
    }
}
