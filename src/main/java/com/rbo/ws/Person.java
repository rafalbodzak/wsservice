package com.rbo.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by rafal on 15.06.19.
 */

@XmlAccessorType(XmlAccessType.FIELD)
// We need to provide the namespace, otherwise it defaults to
// the package name
//namespace="http://ws.rbo.com/"
@XmlRootElement()
public class Person {

    @XmlElement(required = true)
    private Integer id;
    private String name;
    @XmlElement(required = true)
    private String surname;

    public Person(){}

    public Person(Integer id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
