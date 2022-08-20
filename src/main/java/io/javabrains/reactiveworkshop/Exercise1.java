package io.javabrains.reactiveworkshop;

import java.util.Set;
import java.util.stream.Collectors;

import static io.javabrains.reactiveworkshop.StreamSources.intNumbersStream;
import static io.javabrains.reactiveworkshop.StreamSources.userStream;

public class Exercise1 {

    public static void main(String[] args) {
        // Use StreamSources.intNumbersStream()() and StreamSources.userStream()()

        // Print all numbers in the intNumbersStream() stream
        // TODO: Write code here
        intNumbersStream().forEach(Exercise1::print);
        System.out.println();

        // Print numbers from intNumbersStream() that are less than 5
        // TODO: Write code here
        intNumbersStream().filter(integer -> integer < 5).forEach(Exercise1::print);
        System.out.println();

        // Print the second and third numbers in intNumbersStream() that's greater than 5
        // TODO: Write code here
        intNumbersStream().filter(integer -> integer > 5).skip(1).limit(2).forEach(Exercise1::print);
        System.out.println();

        //  Print the first number in intNumbersStream() that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        intNumbersStream().filter(integer -> integer > 5).findAny().ifPresentOrElse(Exercise1::print, () -> Exercise1.print(-1));
        System.out.println();

        // Print first names of all users in userStream()
        // TODO: Write code here
        userStream().map(User::getFirstName).forEach(Exercise1::print);
        System.out.println();
        // Print first names in userStream() for users that have IDs from number stream
        // TODO: Write code here
        Set<Integer> userIds = intNumbersStream().collect(Collectors.toSet());
        userStream().filter(user -> userIds.contains(user.getId())).map(User::getFirstName).forEach(Exercise1::print);

    }

    private static void print(Object obj) {
        System.out.print(obj + " ");
    }

}
