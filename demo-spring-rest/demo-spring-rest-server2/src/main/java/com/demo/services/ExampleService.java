package com.demo.services;

import com.demo.transfer.LoginForm;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public boolean fakeAuthenticate(LoginForm lf) {
        return true;
    }
}