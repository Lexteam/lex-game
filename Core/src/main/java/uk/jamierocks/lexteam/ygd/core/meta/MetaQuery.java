package uk.jamierocks.lexteam.ygd.core.meta;

/**
 * Represents a query that can retrieve data from a {@link MetaContainer}.
 *
 * @author Jamie Mansfield
 */
public class MetaQuery {

    private final String name;

    protected MetaQuery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static MetaQuery of(String name) {
        return new MetaQuery(name);
    }
}
