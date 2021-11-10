package abstract_factory.product.mobilePackage;

import abstract_factory.product.internetPlan.InternetPlan;
import abstract_factory.product.phoneCallPlan.PhoneCallPlan;
import abstract_factory.product.textMessagePlan.TextMessagePlan;

public interface MobilePackage {

    PhoneCallPlan createPhoneCallPlan();

    TextMessagePlan createTextMessagePlan();

    InternetPlan createInternetPlan();

}
