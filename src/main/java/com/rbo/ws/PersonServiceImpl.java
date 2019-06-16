package com.rbo.ws;

import javax.jws.WebService;

/**
 * Created by rafal on 15.06.19.
 */

@WebService(endpointInterface = "com.rbo.ws.PersonService")
public class PersonServiceImpl implements PersonService {

    private static final Person[] persons = {};

    /**
     * addPerson
     * @param p
     * @return id
     */
    public Integer addPerson(Person p) {
        return 1;
    }

    public Person[] getAllPersons() {
        return new Person[]{new Person(1, "Mietek", "Cos"), new Person(2, "Czesław", "Ktos")};
    }
}
