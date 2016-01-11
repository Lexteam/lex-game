/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.meta;

import uk.jamierocks.meta.api.MetaQuery;
import uk.jamierocks.meta.api.QueriesBase;

public final class Queries extends QueriesBase {

    // Tools
    public static final MetaQuery DURATION = of("Duration");
    public static final MetaQuery DIRECTION_TO = of("DirectionTo");
    public static final MetaQuery DIRECTION_FROM = of("DirectionFrom");
}
