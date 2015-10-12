package com.gmail.riley787cmplex.engine.media.libraries;

import com.gmail.riley787cmplex.engine.media.data.MediaData;

import java.util.List;

/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 * to be inherted.
 */
public class MediaLibrary<K, M extends MediaData<?>> {

    public void registerMedia(K key, M media){
        keys.add(key);
        mediaData.add(media);
    }

    public synchronized void addKey(K key){
        keys.add(key);
    }

    public synchronized void finalize_MediaData(M media){
        mediaData.add(media);
    }

    protected synchronized M getData(K key){return mediaData.get(keys.indexOf(key));}

    protected synchronized K getID(M media){return keys.get(mediaData.indexOf(media));}


    volatile private List<K> keys;
    volatile private List<M> mediaData;


}
