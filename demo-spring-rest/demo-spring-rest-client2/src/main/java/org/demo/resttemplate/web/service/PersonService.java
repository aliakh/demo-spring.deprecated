package org.demo.resttemplate.web.service;

import org.demo.resttemplate.web.dto.Person;

public interface PersonService {

    public Person saveUpdatePerson(Person person);

    public Person findPersonById(Integer id);
}