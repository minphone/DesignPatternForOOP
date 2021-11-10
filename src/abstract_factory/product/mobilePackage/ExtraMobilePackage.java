package abstract_factory.product.mobilePackage;

import abstract_factory.product.internetPlan.InternetPlan;
import abstract_factory.product.internetPlan.TenGBInternetPlan;
import abstract_factory.product.phoneCallPlan.PhoneCallPlan;
import abstract_factory.product.phoneCallPlan.SixHundredPhoneCallPlan;
import abstract_factory.product.textMessagePlan.TextMessagePlan;
import abstract_factory.product.textMessagePlan.UnlimitedTextMessagePlan;

public class ExtraMobilePackage implements MobilePackage {

    @Override
    public PhoneCallPlan createPhoneCallPlan() {
        return new SixHundredPhoneCallPlan();
    }

    @Override
    public TextMessagePlan createTextMessagePlan() {
        return new UnlimitedTextMessagePlan();
    }

    @Override
    public InternetPlan createInternetPlan() {
        return new TenGBInternetPlan();
    }
}
