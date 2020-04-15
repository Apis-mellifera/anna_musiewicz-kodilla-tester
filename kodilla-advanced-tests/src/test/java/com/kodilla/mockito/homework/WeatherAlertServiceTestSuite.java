package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherAlertServiceTestSuite {
    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Subscriber subscriber = Mockito.mock(Subscriber.class);
    Localization localization = Mockito.mock(Localization.class);
    Alert alert = Mockito.mock(Alert.class);

    Subscriber firstSubscriber = Mockito.mock(Subscriber.class);
    Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
    Subscriber thirdSubscriber = Mockito.mock(Subscriber.class);
    Localization firstLocalization = Mockito.mock(Localization.class);
    Localization secondLocalization = Mockito.mock(Localization.class);

    @Test
    public void subscriberShouldReceiveAlert() {
        weatherAlertService.addSubscriberToLocalization(localization, subscriber);
        weatherAlertService.sendAlertToAllSubscriber(alert);

        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void alertShouldBeSendToAllSubscribers() {

        weatherAlertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, thirdSubscriber);
        weatherAlertService.sendAlertToAllSubscriber(alert);

        Mockito.verify(firstSubscriber, Mockito.times(2)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
        Mockito.verify(thirdSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void alertShouldBeSendToSubscribersInGivenLocalization() {

        weatherAlertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);
        weatherAlertService.sendAlertToSubscribersInGivenLocalization(firstLocalization, alert);

        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void unsubscribedShouldNotReceiveAlert() {

        weatherAlertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);
        weatherAlertService.removeSubscriber(firstSubscriber);
        weatherAlertService.sendAlertToAllSubscriber(alert);

        Mockito.verify(firstSubscriber, Mockito.never()).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void whenMultiTimeSubscriberRemovedFromLocalizationShouldNotReceiveAlertFromThisLocalization() {

        weatherAlertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);
        weatherAlertService.removeSubscriberFromLocalization(firstSubscriber, firstLocalization);
        weatherAlertService.sendAlertToAllSubscriber(alert);

        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void whenLocalizationCancelledSubscribersNotReceiveAlert() {

        weatherAlertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);
        weatherAlertService.cancelLocalization(secondLocalization);
        weatherAlertService.sendAlertToAllSubscriber(alert);

        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

}