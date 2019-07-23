package demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService {

    @Override
    public int incAndAdd(int a, int b) {
        return inc(a) + inc(b);
    }

    int inc(int i) {
        return i +1;
    }
}
