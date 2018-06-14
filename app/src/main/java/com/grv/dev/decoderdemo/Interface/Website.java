package com.grv.dev.decoderdemo.Interface;

import com.grv.dev.decoderdemo.Model.RootObject;

import java.util.List;

public class Website {

    private String RootObject;
    private List<RootObject> rootObjects;


    public String getRootObject() {
        return RootObject;
    }

    public void setRootObject(String rootObject) {
        RootObject = rootObject;
    }

    public List<com.grv.dev.decoderdemo.Model.RootObject> getRootObjects() {
        return rootObjects;
    }

    public void setRootObjects(List<com.grv.dev.decoderdemo.Model.RootObject> rootObjects) {
        this.rootObjects = rootObjects;
    }

    public Website(String rootObject, List<RootObject> rootObjects) {
        RootObject = rootObject;
        this.rootObjects = rootObjects;


    }




}
