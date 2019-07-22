package demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
