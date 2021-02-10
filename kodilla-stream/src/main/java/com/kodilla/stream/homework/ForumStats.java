package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOlderThan40 = UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge() >= 40 )
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts - users in age of 40 and older: " + avgOlderThan40);

        double avgYoungerThan40 = UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge() < 40 )
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts - users younger than 40: "+ avgYoungerThan40);
    }
}
