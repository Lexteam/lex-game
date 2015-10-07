package com.gmail.riley787cmplex.engine.media.libraries;

import com.gmail.riley787cmplex.engine.media.data.EffectData;
import com.gmail.riley787cmplex.engine.media.data.MediaData;
import com.gmail.riley787cmplex.engine.media.data.MediaDataNoCopy;
import com.google.common.collect.BiMap;

/**
 * Created by ethan on 05/10/15.
 * to be inherted.
 */
public class MediaLibrary<K, M extends MediaDataNoCopy<?>> {

    public MediaLibrary(){}

    public void registerMedia(K key, M media){
        idMediaMap.put(key, media);
    }

    protected M getData(K key){return idMediaMap.get(key);}

    protected K getID(M Media){
        return idMediaMap.inverse().get(Media);
    }

    private BiMap<K, M> idMediaMap;
}
