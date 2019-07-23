package demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService {

    @Override
    public int add(int a, int b) {
        return dec(inc(identity(a))) + dec(inc(identity(b)));
    }

    protected int dec(int i) {
        return i - 1;
    }

    int inc(int i) {
        return i + 1;
    }

    private int identity(int i) {
        return i;
    }
}
