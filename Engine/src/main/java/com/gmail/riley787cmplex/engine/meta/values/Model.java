/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package com.gmail.riley787cmplex.engine.meta.values;


import com.flowpowered.math.vector.Vector3f;

import java.util.Set;

public class Model {

    public void addInstance(ModelInstance instance){instances.add(instance.getInstance());}

    public void removeInstance(ModelInstance instance){instances.remove(instance.getInstance());}

    private Set<Vector3f> verticies;
    private Set<Vector3f> faces;

    private Set<Integer> instances;
}
