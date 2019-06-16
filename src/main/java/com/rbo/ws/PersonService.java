package com.rbo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by rafal on 15.06.19.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PersonService {


    /**
     * addPerson
     * @param p
     * @return id
     */
    @WebMethod
    Integer addPerson(Person p);

    @WebMethod
    Person[] getAllPersons();
}
