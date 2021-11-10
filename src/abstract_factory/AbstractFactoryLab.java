package abstract_factory;

import abstract_factory.product.mobilePackage.MobilePackage;

public class AbstractFactoryLab {


    public static void main(String[] args) {
        MobilePackage mobilePackage = SimpleFactory.getMobilePackage(Plan.ELITE);
        createPlanWithPackage(mobilePackage);

//        MobilePackage mobilePackage1 = SimpleFactory.getMobilePackage(Plan.EXTRA);
//        createPlanWithPackage(mobilePackage1);
//
//        MobilePackage mobilePackage2 = SimpleFactory.getMobilePackage(Plan.STARTER);
//        createPlanWithPackage(mobilePackage2);
    }

    private static void createPlanWithPackage(MobilePackage mobilePackage) {
        System.out.println(mobilePackage.createPhoneCallPlan().toString());
        System.out.println(mobilePackage.createTextMessagePlan().toString());
        System.out.println(mobilePackage.createInternetPlan().toString());
    }

}
