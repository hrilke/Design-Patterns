package FacadeDesignPattern.Service;

import FacadeDesignPattern.Model.Image;

public class ImageLoader {
    public Image loadImage(String path) {
        return new Image();
    }
}
