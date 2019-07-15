package com.demo.persistence.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.demo.persistence.IOperations;
import com.demo.persistence.model.Foo;

public interface IFooService extends IOperations<Foo> {
    
    Page<Foo> findPaginated(Pageable pageable);

}
