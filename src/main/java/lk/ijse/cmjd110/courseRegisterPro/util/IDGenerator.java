package lk.ijse.cmjd110.courseRegisterPro.util;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.UUID;

public class IDGenerator {
    public static String studentIdGen(){
        return "STU-"+ UUID.randomUUID();
    }
}
