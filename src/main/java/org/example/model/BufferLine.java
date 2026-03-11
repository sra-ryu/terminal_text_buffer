package org.example.model;

import java.util.Collections;

public class BufferLine {
    private final Cell[] cells;
    private final int width;

    public BufferLine(Cell[] cells, int width) {
        this.width = width;
        this.cells = new Cell[width];

        Cell defaultCell = new Cell(' ', new CellAttributes(TerminalColor.DEFAULT, TerminalColor.DEFAULT, Collections.emptySet()));
        for (int i = 0; i < width; i++) {
            cells[i] = defaultCell;
        }
    }

}
