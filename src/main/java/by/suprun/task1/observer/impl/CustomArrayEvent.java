package by.suprun.task1.observer.impl;

import by.suprun.task1.entity.CustomArray;

import java.util.EventObject;

public class CustomArrayEvent extends EventObject {

    public CustomArrayEvent(CustomArray source) {
        super(source);
    }

    @Override
    public CustomArray getSource(){
        return (CustomArray) super.getSource();
    }
}