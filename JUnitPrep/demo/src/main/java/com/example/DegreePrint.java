package com.example;

public class DegreePrint {

    public static int Years(String type) {
        if (type == null) {
            return 99;
        } else {
            switch (type.toLowerCase()) {
                case "msc":
                    return 4;
                default:
                    return 0;
            }
        }
    }
}
