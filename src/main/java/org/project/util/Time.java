package org.project.util;

public class Time {
    public static float timeStarted = System.nanoTime();
    // getTime will return in seconds
    public static float getTime() { return (float) ((System.nanoTime() - timeStarted) * 1E-9); }

}
