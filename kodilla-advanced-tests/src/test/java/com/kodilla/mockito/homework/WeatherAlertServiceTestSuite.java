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
        //given
        weatherAlertService.addSubscriberToLocalization(localization, subscriber);

        //when
        weatherAlertService.sendAlertToAllSubscriber(alert);

        //then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void alertShouldBeSendToAllSubscribers() {
        //given
        weatherAlertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, thirdSubscriber);

        //when
        weatherAlertService.sendAlertToAllSubscriber(alert);

        //then
        Mockito.verify(firstSubscriber, Mockito.times(2)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
        Mockito.verify(thirdSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void alertShouldBeSendToSubscribersInGivenLocalization() {
        //given
        weatherAlertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);

        //when
        weatherAlertService.sendAlertToSubscribersInGivenLocalization(firstLocalization, alert);

        //then
        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void unsubscribedShouldNotReceiveAlert() {
        //given
        weatherAlertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);

        //when
        weatherAlertService.removeSubscriber(firstSubscriber);
        weatherAlertService.sendAlertToAllSubscriber(alert);

        //then
        Mockito.verify(firstSubscriber, Mockito.never()).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void whenMultiTimeSubscriberRemovedFromLocalizationShouldNotReceiveAlertFromThisLocalization() {
        //given
        weatherAlertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);

        //when
        weatherAlertService.removeSubscriberFromLocalization(firstSubscriber, firstLocalization);
        weatherAlertService.sendAlertToAllSubscriber(alert);

        //then
        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void whenLocalizationCancelledSubscribersNotReceiveAlert() {
        //given
        weatherAlertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        weatherAlertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        weatherAlertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);

        //when
        weatherAlertService.cancelLocalization(secondLocalization);
        weatherAlertService.sendAlertToAllSubscriber(alert);

        //then
        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }
}