package za.ac.cput.group6.Util;

import java.util.UUID;

public class GenerateID {

    //this is method which will generate a random ID, when pulled across other classes
    public static String generateID(){
        return UUID.randomUUID().toString();

    }
}
