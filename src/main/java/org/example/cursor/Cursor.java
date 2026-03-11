package org.example.cursor;

import org.example.model.CellAttributes;

public class Cursor {
    private int col, row;
    private final int maxWidth;
    private final int maxHeight;

    public Cursor(int maxWidth, int maxHeight) {
        this.col = 0;
        this.row = 0;
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
    }
}