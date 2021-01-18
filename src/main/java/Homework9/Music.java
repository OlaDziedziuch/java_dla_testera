package Homework9;

public interface Music {

    String NAME = "MUSIC";

    void playMusic();
    void pauseMusic();
    void stopMusic();

    default void sayHello() {
        System.out.println("Hello! Is it me you're looking for?");
    }

    static String getName() {
        privateMusic();
        return NAME;
    }

    private static void privateMusic() {
        System.out.println("Hello private");}
}
