package coinflipper;

import java.security.SecureRandom;
import java.util.function.Function;

public class CoinFlipper {

    private static final Function<Boolean, String> coinFlippingFunction = coinSide -> coinSide
            ? "HEAD"
            : "TAILS";

    public String flipCoin() {
        return coinFlippingFunction.apply(isHead());
    }

    private boolean isHead() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextBoolean();
    }
}
