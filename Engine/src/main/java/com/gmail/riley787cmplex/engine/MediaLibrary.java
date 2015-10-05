package com.gmail.riley787cmplex.engine;

import com.google.common.collect.BiMap;

/**
 * Created by ethan on 05/10/15.
 * to be inherted.
 */
public class MediaLibrary<K, M> {

    public MediaLibrary(String MediaDir){
        //TBI
    }

    public void registerDir(String Dir){
        //TBI
    }
    public void registerMedia(String Name){
        //TBI
    }

    protected M getData(K key){
        return idMediaMap.get(key);
    }

    protected K getID(M Media){
        return idMediaMap.inverse().get(Media);
    }

    private BiMap<K, M> idMediaMap;
}
