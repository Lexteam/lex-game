package uk.jamierocks.lexteam.ygd.core.service;

/**
 * This exception is called whenever an attempt is made to register a provider of a type that has previously
 * been registered.
 *
 * @author Jamie Mansfield
 */
public class ProviderExistsException extends Exception {

    public ProviderExistsException() {
        super("A provider already exists for that service!");
    }
}
