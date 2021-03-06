package com.isador.btce.api.tools;

public class HexEncoder {
    private static final char[] DIGITS_LOWER = { '0', '1', '2', '3', '4', '5',
	    '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

    public static char[] encodeHex(byte[] data) {
	char[] out = new char[data.length << 1];
	for (int i = 0, j = 0; i < data.length; i++) {
	    out[j++] = DIGITS_LOWER[(0xF0 & data[i]) >>> 4];
	    out[j++] = DIGITS_LOWER[0x0F & data[i]];
	}
	return out;
    }
}
