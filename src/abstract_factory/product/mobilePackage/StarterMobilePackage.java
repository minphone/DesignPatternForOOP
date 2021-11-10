package abstract_factory.product.mobilePackage;

import abstract_factory.product.internetPlan.InternetPlan;
import abstract_factory.product.internetPlan.OneGBInternetPlan;
import abstract_factory.product.phoneCallPlan.OneHundredPhoneCallPlan;
import abstract_factory.product.phoneCallPlan.PhoneCallPlan;
import abstract_factory.product.textMessagePlan.TextMessagePlan;
import abstract_factory.product.textMessagePlan.UnlimitedTextMessagePlan;

public class StarterMobilePackage implements MobilePackage {

    @Override
    public PhoneCallPlan createPhoneCallPlan() {
        return new OneHundredPhoneCallPlan();
    }

    @Override
    public TextMessagePlan createTextMessagePlan() {
        return new UnlimitedTextMessagePlan();
    }

    @Override
    public InternetPlan createInternetPlan() {
        return new OneGBInternetPlan();
    }
}
