package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question3;

public class Main {
    public static void main(String[] args) {
        caculateTotalMonthlyMoney();

    }

    private static void caculateTotalMonthlyMoney() {
        System.out.println("Last month:");
        BusinessRoom previousBusinessRoom = new BusinessRoom();
        previousBusinessRoom.setNightNumber(12);
        previousBusinessRoom.setTotalMoney(previousBusinessRoom.caculateMonthlyMoney(previousBusinessRoom.getNightNumber()));
        previousBusinessRoom.printRoomType();


        DeluxeRoom previousDeluxeRoom = new DeluxeRoom();
        previousDeluxeRoom.setNightNumber(3);
        previousDeluxeRoom.setServiceCharge(10000);
        previousDeluxeRoom.setTotalMoney(previousDeluxeRoom.caculateMonthlyMoney(previousDeluxeRoom.getNightNumber(), previousDeluxeRoom.getServiceCharge()));
        previousDeluxeRoom.printRoomType();

        PremiumRoom previousPremiumRoom = new PremiumRoom();
        previousPremiumRoom.setNightNumber(2);
        previousPremiumRoom.setServiceCharge(20000);
        previousPremiumRoom.setTotalMoney(previousPremiumRoom.caculateMonthlyMoney(previousPremiumRoom.getNightNumber(), previousPremiumRoom.getServiceCharge()));
        previousPremiumRoom.printRoomType();

        System.out.println("");
        System.out.println("This month:");
        BusinessRoom businessRoom = new BusinessRoom();
        businessRoom.setNightNumber(12);
        businessRoom.setTotalMoney(businessRoom.caculateMonthlyMoney(businessRoom.getNightNumber()));
        businessRoom.printRoomType();


        DeluxeRoom deluxeRoom = new DeluxeRoom();
        deluxeRoom.setNightNumber(10);
        deluxeRoom.setServiceCharge(10000);
        deluxeRoom.setTotalMoney(deluxeRoom.caculateMonthlyMoney(deluxeRoom.getNightNumber(), deluxeRoom.getServiceCharge()));
        deluxeRoom.printRoomType();

        PremiumRoom premiumRoom = new PremiumRoom();
        premiumRoom.setNightNumber(10);
        premiumRoom.setServiceCharge(20000);
        premiumRoom.setTotalMoney(premiumRoom.caculateMonthlyMoney(premiumRoom.getNightNumber(), premiumRoom.getServiceCharge()));
        premiumRoom.printRoomType();

        System.out.println("");
        if(businessRoom.getTotalMoney() >= (previousBusinessRoom.getTotalMoney() * 125 / 100)){
            System.out.println("Business room have a good revenue");
        }
        if (deluxeRoom.getTotalMoney() >= (previousDeluxeRoom.getTotalMoney() * 125 / 100)) {
            System.out.println("Deluxe room have a good revenue");
        }
        if (premiumRoom.getTotalMoney() >= (previousPremiumRoom.getTotalMoney() * 125 / 100)) {
            System.out.println("Premium room have a good revenue");
        }
    }


}
