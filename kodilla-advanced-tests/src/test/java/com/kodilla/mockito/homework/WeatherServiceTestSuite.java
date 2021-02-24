package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {
    WeatherService weatherService = new WeatherService();
    ServiceUser serviceUser = Mockito.mock(ServiceUser.class);
    WeatherAlert weatherAlert = Mockito.mock(WeatherAlert.class);
    WeatherAlert weatherAlert2 = Mockito.mock(WeatherAlert.class);
    Location location = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);

    @Test
    public void subscribedUserShouldReceiveAlertsFromChosenLocations() {
        weatherService.addServiceUser(serviceUser,location);
        weatherService.addNewLocation(serviceUser, location2);

        weatherService.sendAlertFromLocation(location,weatherAlert);
        weatherService.sendAlertFromLocation(location,weatherAlert2);
        weatherService.sendAlertFromLocation(location2,weatherAlert2);

        Mockito.verify(serviceUser, Mockito.times(1)).receiveAlert(weatherAlert);
        Mockito.verify(serviceUser, Mockito.times(2)).receiveAlert(weatherAlert2);
    }

    @Test
    public void userNotReceiveAlertsFormUnsubscribedLocation() {
        weatherService.addServiceUser(serviceUser, location);
        weatherService.unsubscribeLocation(serviceUser,location);
        weatherService.sendAlertFromLocation(location, weatherAlert);

        Mockito.verify(serviceUser, Mockito.never()).receiveAlert(weatherAlert);
    }

    @Test
    public void whenUnsubscribeAllLocationsNotReceiveAnyAlert() {
        weatherService.addServiceUser(serviceUser,location);
        weatherService.addNewLocation(serviceUser, location2);

        weatherService.unsubscribeAllLocations(serviceUser);
        weatherService.sendAlertFromLocation(location, weatherAlert);
        weatherService.sendAlertFromLocation(location2, weatherAlert);
        Mockito.verify(serviceUser, Mockito.never()).receiveAlert(weatherAlert);
    }

    @Test
    public void onlySubscribersOfTheLocationReceiveAlertsFromThisLocation() {
        ServiceUser serviceUser2 = Mockito.mock(ServiceUser.class);
        ServiceUser serviceUser3 = Mockito.mock(ServiceUser.class);
        weatherService.addServiceUser(serviceUser,location);
        weatherService.addServiceUser(serviceUser2,location2);
        weatherService.addServiceUser(serviceUser3,location2);

        weatherService.sendAlertFromLocation(location2,weatherAlert2);
        Mockito.verify(serviceUser, Mockito.never()).receiveAlert(weatherAlert2);
        Mockito.verify(serviceUser2, Mockito.times(1)).receiveAlert(weatherAlert2);
        Mockito.verify(serviceUser3, Mockito.times(1)).receiveAlert(weatherAlert2);
    }

    @Test
    public void allUsersShouldReceiveAlertOnlyOnce() {
        ServiceUser serviceUser2 = Mockito.mock(ServiceUser.class);
        ServiceUser serviceUser3 = Mockito.mock(ServiceUser.class);
        weatherService.addServiceUser(serviceUser,location);
        weatherService.addServiceUser(serviceUser2,location2);
        weatherService.addServiceUser(serviceUser3,location2);

        weatherService.sendAlertToAllUsers(weatherAlert);
        Mockito.verify(serviceUser, Mockito.times(1)).receiveAlert(weatherAlert);
        Mockito.verify(serviceUser2, Mockito.times(1)).receiveAlert(weatherAlert);
        Mockito.verify(serviceUser3, Mockito.times(1)).receiveAlert(weatherAlert);
    }

    @Test
    public void whenLocationIsRemovedNoOneReceiveAlertFromThisLocation() {
        ServiceUser serviceUser2 = Mockito.mock(ServiceUser.class);
        ServiceUser serviceUser3 = Mockito.mock(ServiceUser.class);
        weatherService.addServiceUser(serviceUser,location);
        weatherService.addNewLocation(serviceUser,location2);
        weatherService.addServiceUser(serviceUser2,location2);
        weatherService.addServiceUser(serviceUser3,location);

        weatherService.removeLocation(location2);
        weatherService.sendAlertFromLocation(location2,weatherAlert);
        Mockito.verify(serviceUser, Mockito.never()).receiveAlert(weatherAlert);
        Mockito.verify(serviceUser2, Mockito.never()).receiveAlert(weatherAlert);
        Mockito.verify(serviceUser3, Mockito.never()).receiveAlert(weatherAlert);
    }
}
