package Services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {
    private Double interestRate;

    public BrazilInterestService() {

    }

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterstRate() {
        return interestRate;
    }
}
