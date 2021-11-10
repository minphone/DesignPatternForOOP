package abstract_factory;

import abstract_factory.product.mobilePackage.EliteMobilePackage;
import abstract_factory.product.mobilePackage.ExtraMobilePackage;
import abstract_factory.product.mobilePackage.MobilePackage;
import abstract_factory.product.mobilePackage.StarterMobilePackage;

public final class SimpleFactory {

    protected static MobilePackage getMobilePackage(Plan plan) {
        if (plan == Plan.ELITE) {
            return new EliteMobilePackage();
        } else if (plan == Plan.EXTRA) {
            return new ExtraMobilePackage();
        } else {
            return new StarterMobilePackage();
        }
    }

}
