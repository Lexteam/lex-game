package uk.jamierocks.lexteam.ygd.core.service;

public class ProviderExistsException extends Exception {

    public ProviderExistsException() {
        super("A provider already exists for that service!");
    }
}
