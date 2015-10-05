package com.gmail.riley787cmplex.engine;

/**
 * Created by ethan on 05/10/15.
 */
public class MediaData<T>{

    public MediaData(String filename, T id){parse(filename);}

    final public T getName(){return Name;}
    protected void parse(String filename){}

    private T Name;
}
