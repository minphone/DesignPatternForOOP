package abstract_factory.product.mobilePackage;

import abstract_factory.product.internetPlan.InternetPlan;
import abstract_factory.product.internetPlan.UnlimitedInternetPlan;
import abstract_factory.product.phoneCallPlan.PhoneCallPlan;
import abstract_factory.product.phoneCallPlan.UnlimitedPhoneCallPlan;
import abstract_factory.product.textMessagePlan.TextMessagePlan;
import abstract_factory.product.textMessagePlan.UnlimitedTextMessagePlan;

public class EliteMobilePackage implements MobilePackage {

    @Override
    public PhoneCallPlan createPhoneCallPlan() {
        return new UnlimitedPhoneCallPlan();
    }

    @Override
    public TextMessagePlan createTextMessagePlan() {
        return new UnlimitedTextMessagePlan();
    }

    @Override
    public InternetPlan createInternetPlan() {
        return new UnlimitedInternetPlan();
    }
}
