package Services;

import java.security.InvalidParameterException;

public class UsaIterestService implements InterestService {
    private Double interestRate;

    public UsaIterestService() {

    }

    public UsaIterestService(Double interestRate) {
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
