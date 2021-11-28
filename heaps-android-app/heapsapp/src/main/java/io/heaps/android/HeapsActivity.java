package io.heaps.android;

import org.libsdl.app.SDLActivity;

public class HeapsActivity extends SDLActivity {
    public static native int startHL();

    // Used to load the native libraries on application startup.
    static {
        System.loadLibrary("openal");
        System.loadLibrary("SDL2");
        System.loadLibrary("heapsapp");
    }

    @Override
    protected String[] getLibraries() {
        return new String[]{
                "openal",
                "SDL2",
                "heapsapp"
        };
    }

    @Override
    protected void run() {
        startHL();
    }
}
