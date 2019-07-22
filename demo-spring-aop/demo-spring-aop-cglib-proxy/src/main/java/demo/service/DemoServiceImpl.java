package demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl  {

    public int add(int a, int b) {
        return a + b;
    }
}
