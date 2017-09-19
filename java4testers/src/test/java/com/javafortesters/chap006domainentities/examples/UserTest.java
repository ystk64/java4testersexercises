package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructWithUsernameAndPassword() {
        User user = new User();

        assertEquals("given username expected", "admin", user.getUsername());
        assertEquals("given password expected", "pA55w0rD", user.getPassword());
    }

    @Test
    public void userHasDefaultUsernameAndPassword() {
        User user = new User();
        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed() {
        User user = new User();
        user.setPassword("PaZZwor6");

        assertEquals("setter password expected", "PaZZwor6", user.getPassword());
    }

    @Test
    public void createLotsOfUsers() {
        User[] users = new User[10];
        for (int i = 0; i < users.length; i++) {
            users[i]= new User();
            if (i>10) break;
            users[i].setUsername("user" + i);
            users[i].setPassword("password" + i);
            System.out.println(users[i].getUsername());
        }
        assertEquals("username 1 didn't match!","user0",users[0].getUsername());
        assertEquals("username 10 didn't match!", "user9",users[9].getUsername());

    }

        @Test
        public void createUserArray() {
            String[] listOfUsers = new String[]{"user1", "user2", "user3"};
            assertEquals("user1", listOfUsers[0]);
            for (int i = 0; i < listOfUsers.length; i++)
                System.out.println(listOfUsers[i]);
        }

        @Test
        public void canSortAnArray() {
            Workday[] workdays = new Workday[7];
            for (int i = 0; i < workdays.length; i++) {
                workdays[i] = new Workday();
                System.out.println(workdays[i]);
            }
        }

}


