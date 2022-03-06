package by.suprun.task1.service.impl;

public class IdCustomArrayGenerator {
    private static final int MIN_ID = 100000;
    private static final int MAX_ID = 999999;
    private static int lastAssignedIdFromPositionOfMinId = 0;

    private IdCustomArrayGenerator(){}

    public static int getNextId(){
        lastAssignedIdFromPositionOfMinId++;
        if(MAX_ID < MIN_ID + lastAssignedIdFromPositionOfMinId){
            lastAssignedIdFromPositionOfMinId = 0;
        }
        return MIN_ID + lastAssignedIdFromPositionOfMinId;
    }
}
