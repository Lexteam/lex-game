/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.engine.meta.values;


import com.flowpowered.math.vector.Vector3f;

import java.util.Set;

public class Model {

    public void addInstance(ModelInstance instance){instances.add(instance.getInstance());}

    public void removeInstance(ModelInstance instance){instances.remove(instance.getInstance());}

    private Set<Vector3f> verticies;
    private Set<Vector3f> faces;

    private Set<Integer> instances;
}
