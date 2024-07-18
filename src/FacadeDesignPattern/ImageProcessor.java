package FacadeDesignPattern;

import FacadeDesignPattern.Model.Image;
import FacadeDesignPattern.Service.*;

public class ImageProcessor {
    private ImageLoader imageLoader;
    private AnalyticsService analyticsService;
    private FilterService filterService;
    private ImageWriter imageWriter;
    private ImageModifier imageModifier;
    public ImageProcessor(ImageLoader il, FilterService fs, ImageModifier im, ImageWriter iw, AnalyticsService as) {
        this.imageLoader = il;
        this.filterService = fs;
        this.imageModifier = im;
        this.imageWriter = iw;
        this.analyticsService = as;
    }

    public void process(String path, String filterType, int brightness) {
        Image image = imageLoader.loadImage(path);

        filterService.applyFilter(image, filterType);

        imageModifier.adjustBrightness(image, brightness);

        imageWriter.saveImage(image);

        analyticsService.store(image);
    }
}
