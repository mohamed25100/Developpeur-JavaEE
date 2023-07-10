package fr.dawan.jpahibernate.entities.basic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.dawan.jpahibernate.entities.basic.dao.B_FooRepository;
import fr.dawan.jpahibernate.entities.basic.models.B_Foo;

@Service
public class B_FooService {
    private final B_FooRepository repository;

    public B_FooService(B_FooRepository repository) {
        super();
        this.repository = repository;
    }

    public List<B_Foo> all(){
        return repository.findAll();
    }
}
