package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherService {
    private Map<ServiceUser,Set<Location>> allUsers = new HashMap<>();

    public void addServiceUser(ServiceUser user, Location location){
        Set<Location> locations = allUsers.getOrDefault(user,new HashSet<>());
        locations.add(location);
        allUsers.put(user, locations);
    }

    public void sendAlertFromLocation(Location location, WeatherAlert weatherAlert){
        for(Map.Entry<ServiceUser,Set<Location>> user : allUsers.entrySet()) {
            if (user.getValue().contains(location)) {
                user.getKey().receiveAlert(weatherAlert);
            }
        }
    }

    public void addNewLocation(ServiceUser user, Location location) {
        allUsers.get(user).add(location);
    }

    public void unsubscribeLocation(ServiceUser user, Location location) {
         allUsers.get(user).remove(location);
    }

    public void unsubscribeAllLocations(ServiceUser user) {
        allUsers.put(user, new HashSet<>());
    }

    public void sendAlertToAllUsers(WeatherAlert weatherAlert) {
        for(Map.Entry<ServiceUser,Set<Location>> user : allUsers.entrySet()) {
            user.getKey().receiveAlert(weatherAlert);
        }
    }

    public void removeLocation(Location location) {
        for(Map.Entry<ServiceUser,Set<Location>> user : allUsers.entrySet()) {
            if (user.getValue().contains(location)) {
                user.getValue().remove(location);
            }
        }
    }
}
