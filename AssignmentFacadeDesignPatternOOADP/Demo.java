import java.io.File;

public class Demo {
    public static void main(final String[] args) {
        final VideoConversionFacade mp4Video = new VideoConversionFacade();
        final File oggVideo = mp4Video.convert("video.mp4", "ogg");
    }
}