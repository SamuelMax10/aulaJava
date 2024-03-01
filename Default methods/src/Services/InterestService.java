package Services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterstRate();

    default double payment(double amount, int months) { //O modificador default permite que se adicione métodos a uma interface sem o risco de perder compatibilidade com versões anteriores.
        if (months < 1)
            throw new InvalidParameterException("Os mesês deve ser maior que zero");
        return amount * Math.pow(1 + getInterstRate() / 100, months);
    }
}


