/**
 * @author Santiago Garcia
 * @Version 1.0
 * @since Java 17
 * @see Strategy.ImageStorage.Compressor
 * @see Strategy.ImageStorage.Filter
 * @see Strategy.ImageStorage.JPEGCompressor
 * @see Strategy.ImageStorage.PNGCompressor
 * @see Strategy.ImageStorage.BlackAndWhiteFilter
 * @see Strategy.ImageStorage.HighContrastFilter
 * Context class: ImageStorage give us the ability to store the images that our users upload
 */

package Strategy.ImageStorage;

public class ImageStorage {
    //Attributes
    private Compressor compressor;
    private Filter filter;

    //Public methods
    /**
     *
     * @param fileName
     * Open Closed Principle: Classes are open for extension but closed for modification. We can add a new compressor
     * or filter without impacting the ImageStorage class. By setting the type of compressor and filter as arguments we
     * can apply different filters and compressors to different images or even the same image:
     */
    public void store(String fileName, Compressor compressor, Filter filter){
        //Image compression algorithm
        compressor.compress(fileName);
        filter.applyFilter(fileName);
    }


}
