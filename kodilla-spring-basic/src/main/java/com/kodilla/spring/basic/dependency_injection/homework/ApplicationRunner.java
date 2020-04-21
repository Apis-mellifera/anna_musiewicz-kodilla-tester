package com.kodilla.spring.basic.dependency_injection.homework;

public class ApplicationRunner {
    public static void main(String[] args) {
        DeliveryService deliveryService = new PackageService();
        NotificationService notificationService = new ReceiverService();
        Application application = new Application(deliveryService, notificationService);
        application.sendPackage("Hill Street 11, New York", 18.2);
    }
}
