package com.gpteam.java_learning;

public class EnkapsulacjaPassByX {
    class StringContainer {
        private String value;

        private static final int MAX_STRING_LENGTH = 10;
        private static final int MIN_STRING_LENGTH = 2;

        void putString(String value) {
            if (value.length() < MIN_STRING_LENGTH && value.length() > MAX_STRING_LENGTH) {
                throw new IllegalArgumentException("");
            }
        }

    }
}
