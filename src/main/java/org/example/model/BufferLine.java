package org.example.model;

import java.util.Collections;

public class BufferLine {
    private final Cell[] cells;
    private final int width;

    public BufferLine(int width) {
        this.width = width;
        this.cells = new Cell[width];

        Cell defaultCell = new Cell(' ', new CellAttributes(TerminalColor.DEFAULT, TerminalColor.DEFAULT, Collections.emptySet()));
        for (int i = 0; i < width; i++) {
            cells[i] = defaultCell;
        }
    }

    public void setCell(int col, Cell cell) {
        if (col >= 0 && col < width) {
            cells[col] = cell;
        }
    }

    public Cell getCell(int col) {
        if (col >= 0 && col < width) {
            return cells[col];
        } else {
            return null;
        }
    }
}
