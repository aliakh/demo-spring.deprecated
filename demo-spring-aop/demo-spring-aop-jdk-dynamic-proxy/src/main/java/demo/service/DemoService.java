package demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService {

    @Override
    public int add(int a, int b) {
        return mul(dec(inc(nop(a))) + dec(inc(nop(b))), 1);
    }

    public int mul(int a, int b) {
        return a * b;
    }

    protected int dec(int i) {
        return i - 1;
    }

    int inc(int i) {
        return i + 1;
    }

    private int nop(int i) {
        return i;
    }
}
