package io.javabrains.reactiveworkshop;

import static io.javabrains.reactiveworkshop.ReactiveSources.intNumberMono;

public class Exercise4 {

    public static void main(String[] args) {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        intNumberMono().subscribe(System.out::println);

        // Get the value from the Mono into an integer variable
        final Integer returnedValue = intNumberMono().block();
        System.out.println("returnedValue = " + returnedValue);
    }

}
