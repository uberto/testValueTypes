package com.ubertob.geometric;

inline public class PaletteColor {
    public final byte colorIndex;

    public PaletteColor(byte index) {
        colorIndex = index;
    }

    public static PaletteColor green(){
        return __WithField(PaletteColor.default.colorIndex, 1);
    }

    public static PaletteColor blue(){
        return __WithField(PaletteColor.default.colorIndex, 2);
    }

    public static PaletteColor red(){
        return __WithField(PaletteColor.default.colorIndex, 3);
    }
}
