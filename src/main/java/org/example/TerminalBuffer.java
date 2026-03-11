package org.example;

import org.example.model.Cell;

public class TerminalBuffer {
    private final int width;
    private final int height;
    private final Cell[][] grid;

    public TerminalBuffer(int width, int height, Cell[][] grid) {
        this.width = width;
        this.height = height;
        this.grid = new Cell[height][width];
    }
}
