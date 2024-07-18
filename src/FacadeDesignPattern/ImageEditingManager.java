package FacadeDesignPattern;

import FacadeDesignPattern.Service.*;

public class ImageEditingManager {
    private ImageProcessor imageProcessor;

    public ImageEditingManager(ImageLoader il, FilterService fs, ImageModifier im, ImageWriter iw, AnalyticsService as){
        this.imageProcessor = new ImageProcessor(il,fs,im,iw,as);

    }

    public void editImage(String path, String filterType, int brightness) {
        imageProcessor.process(path, filterType,brightness);
    }
}
