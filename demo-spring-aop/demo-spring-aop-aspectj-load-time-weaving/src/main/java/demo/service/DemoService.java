package demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
