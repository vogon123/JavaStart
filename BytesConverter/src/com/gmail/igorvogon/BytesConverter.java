//BytesConverter

package com.gmail.igorvogon;

public class BytesConverter {
    public static void main(String[] args) {
        long totalBytes = 254318501496l; // Input: any valid number of bytes

        long kilo = 1024;
        long mega = 1024 * kilo;
        long giga = 1024 * mega;

        long gigaBytes = totalBytes / giga;
        long megaBytes = totalBytes % giga / mega;
        long kiloBytes = totalBytes % mega / kilo;
        long bytes = totalBytes % kilo;

        System.out.println(gigaBytes + " GB, " + megaBytes + " MB, "
                + kiloBytes + " KB, " + bytes + " B");
    }

}
