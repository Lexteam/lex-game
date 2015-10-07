package com.gmail.riley787cmplex.engine.media.libraries;

import com.gmail.riley787cmplex.engine.media.data.EffectData;
import com.gmail.riley787cmplex.engine.media.data.MediaData;
import com.gmail.riley787cmplex.engine.media.data.MediaDataNoCopy;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ethan on 05/10/15.
 * to be inherted.
 */
public class MediaLibrary<K, M extends MediaDataNoCopy<?>> {

    public MediaLibrary(){}

    final Lock lock = new ReentrantLock();

    public void registerMedia(K key, M media){
        keys.add(key);
        mediaData.add(media);
    }

    public void putKeyOnly(K key){

        if(!lock.tryLock()) {
            lock.lock();
            try {
                keys.add(key);
            }
            finally {}
        }
        else{
            //throw
        }
    }

    public void addMedia_tolastkey(M media){
        if(lock.tryLock()) {
            try {
                mediaData.add(media);
            }
            finally {
                lock.unlock();
            }
        }
    }

    protected M getData(K key){return mediaData.get(keys.indexOf(key));}

    protected K getID(M media){return keys.get(mediaData.indexOf(media));}

    private List<K> keys;
    private List<M> mediaData;
}
