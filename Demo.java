package Strategy.ImageStorage;

public class Demo {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        /*
            By setting the type of compressor and filter as arguments of the store() method we can apply different
            filters and compressors to different images or even the same image:
         */
        imageStorage.store("Image.txt",new PNGCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("Image.txt", new JPEGCompressor(), new HighContrastFilter());
    }
}
