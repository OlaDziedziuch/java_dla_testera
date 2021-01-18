package Homework9;

public interface Video {

    void playVideo();
    void pauseVideo();
    void stopVideo();

    default void sayHello() {
        System.out.println("hello video");
    }
}
