package io.javabrains.reactiveworkshop;

import java.io.IOException;

import static io.javabrains.reactiveworkshop.ReactiveSources.intNumbersFlux;
import static io.javabrains.reactiveworkshop.ReactiveSources.userFlux;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        intNumbersFlux().subscribe(Exercise2::print);

        // Print all users in the ReactiveSources.userFlux stream
        userFlux().map(User::getFirstName).subscribe(Exercise2::print);

        System.out.println("Press a key to end");
        System.in.read();
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }

}
