package org.example.model;

import java.util.Set;

public class CellAttributes {
    private final TerminalColor fgColor;
    private final TerminalColor bgColor;
    private final Set<StyleFlag> styles;

    public CellAttributes(TerminalColor fgColor, TerminalColor bgColor, Set<StyleFlag> styles) {
        this.fgColor = fgColor;
        this.bgColor = bgColor;
        this.styles = styles;
    }

    public TerminalColor getFgColor() { return fgColor; }
    public TerminalColor getBgColor() { return bgColor; }
    public Set<StyleFlag> getStyles() { return styles; }

}
