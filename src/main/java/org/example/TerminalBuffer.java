package org.example;

import org.example.model.BufferLine;
import org.example.model.Cell;

import java.util.*;

public class TerminalBuffer {
    private final int width;
    private final int height;
    private final int scrollBackMaxSize;

    private final List<BufferLine> screen;

    private final Deque<BufferLine> scrollback;

    public TerminalBuffer(int width, int height, int scrollBackMaxSize) {
        this.width = width;
        this.height = height;
        this.scrollBackMaxSize = scrollBackMaxSize;
        this.screen = new ArrayList<>(height);
        this.scrollback = new ArrayDeque<>(scrollBackMaxSize);

        for (int i = 0; i < height; i++) {
            screen.add(new BufferLine(width));
        }
    }
}
