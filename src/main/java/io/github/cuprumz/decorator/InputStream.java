package io.github.cuprumz.decorator;

import java.io.IOException;

public class InputStream {
    // abstract
    public int read() throws IOException {
        System.out.println("read in InputStream");
        return 0;
    }
}
