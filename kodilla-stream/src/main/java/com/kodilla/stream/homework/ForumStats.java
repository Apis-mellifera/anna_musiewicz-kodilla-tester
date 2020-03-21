package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgPosts = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(p -> p.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avgPosts);

        double avgPostsUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(p -> p.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avgPostsUnder40);
    }
}
