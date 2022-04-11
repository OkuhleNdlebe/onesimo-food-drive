package za.ac.cput.group6.Util;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * StudentRepository number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */

import java.util.UUID;

public class GenerateID {

    //this is method which will generate a random ID, when pulled across other classes
    public static String generateID(){
        return UUID.randomUUID().toString();

    }
}
