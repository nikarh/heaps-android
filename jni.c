#include <jni.h>

extern int main(int argc, char *argv[]); 

JNIEXPORT int JNICALL Java_io_heaps_android_HeapsActivity_startHL(JNIEnv* env, jclass cls) {
    return main(0, NULL);
}
