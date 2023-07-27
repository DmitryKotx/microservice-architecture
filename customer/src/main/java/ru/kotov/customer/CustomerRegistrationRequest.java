package ru.kotov.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
