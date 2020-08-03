package io.github.cuprumz.decorator;

import java.io.IOException;

public class FilterInputStream {
    protected volatile InputStream in;

    protected FilterInputStream(InputStream in) {
        this.in = in;
    }

    public int read() throws IOException {
        return in.read();
    }
}
