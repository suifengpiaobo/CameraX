package me.shouheng.camerax.config.creator;

import me.shouheng.camerax.manager.CameraManager;
import me.shouheng.camerax.preview.CameraPreview;

/**
 * @author WngShhng (shouheng2015@gmail.com)
 * @version 2019/4/13 22:55
 */
public interface CameraManagerCreator {

    /**
     * Method used to create {@link CameraManager}.
     *
     * @param cameraPreview the {@link CameraPreview}
     * @return CameraManager object.
     */
    CameraManager create(CameraPreview cameraPreview);
}