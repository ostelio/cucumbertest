package eu.dada.cucumbertest.model;

public class UsersFactory {
    public static User createValidUser(){
        User user = new User();
        user.withUserName("test1@accattatillo.com").withPassword("test1accattatillo");
        return user;
    }

    public static User createInvalidUser(){
        User user = new User();
        user.withUserName("").withPassword("");
        return user;
    }
}