package com.kodilla.spring.basic.dependency_injection.homework;

public class Application implements ShippingCenter {
    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public Application(DeliveryService deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        }
        else
            notificationService.fail(address);
    }
}
