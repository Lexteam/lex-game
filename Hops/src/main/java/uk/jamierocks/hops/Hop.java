package uk.jamierocks.hops;

/**
 * This annotation represents a 'hop'
 *
 * A hop class defines a set of changes to make to a class, at runtime.
 */
public @interface Hop {

    /**
     * The class(es) to apply the hops to.
     *
     * @return target class(es)
     */
    Class<?>[] value();
}
