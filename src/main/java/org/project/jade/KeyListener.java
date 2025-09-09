package org.project.jade;

import static org.lwjgl.glfw.GLFW.*;

public class KeyListener {
    private static KeyListener instance;
    private boolean keyPressed[] = new boolean[GLFW_KEY_LAST + 1];

    private KeyListener(){}

    public static KeyListener get(){
        if(KeyListener.instance==null){
            KeyListener.instance = new KeyListener();
        }
        return KeyListener.instance;
    }

    public static void keyCallback(long window, int key, int scancode, int action, int mods){
        if (key == GLFW_KEY_UNKNOWN) return;

        if (key < 0 || key >= get().keyPressed.length) return;

        if(action == GLFW_PRESS || action == GLFW_REPEAT){
            get().keyPressed[key] = true;
        } else if (action == GLFW_RELEASE) {
            get().keyPressed[key] = false;
        }
    }
    public static boolean isKeyPressed(int keyCode){
        return get().keyPressed[keyCode];
    }

}
