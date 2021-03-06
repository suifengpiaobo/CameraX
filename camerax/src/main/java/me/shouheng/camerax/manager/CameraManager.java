package me.shouheng.camerax.manager;

import android.content.Context;
import me.shouheng.camerax.config.sizes.AspectRatio;
import me.shouheng.camerax.config.sizes.Size;
import me.shouheng.camerax.config.sizes.SizeMap;
import me.shouheng.camerax.enums.Camera;
import me.shouheng.camerax.enums.Flash;
import me.shouheng.camerax.enums.Media;
import me.shouheng.camerax.listener.*;

import java.io.File;

/**
 * @author WngShhng (shouheng2015@gmail.com)
 * @version 2019/4/13 22:49
 */
public interface CameraManager {

    void initialize(Context context);

    void openCamera(CameraOpenListener cameraOpenListener);

    boolean isCameraOpened();

    @Camera.Face int getCameraFace();

    void switchCamera(@Camera.Face int cameraFace);

    void setMediaType(@Media.Type int mediaType);

    void setVoiceEnable(boolean voiceEnable);

    boolean isVoiceEnable();

    void setAutoFocus(boolean autoFocus);

    boolean isAutoFocus();

    void setFlashMode(@Flash.FlashMode int flashMode);

    @Flash.FlashMode
    int getFlashMode();

    void setZoom(float zoom);

    float getZoom();

    float getMaxZoom();

    void setExpectSize(Size expectSize);

    void setExpectAspectRatio(AspectRatio expectAspectRatio);

    Size getSize(@Camera.SizeFor int sizeFor);

    SizeMap getSizes(@Camera.SizeFor int sizeFor);

    AspectRatio getAspectRatio();

    void setDisplayOrientation(int displayOrientation);

    void addCameraSizeListener(CameraSizeListener cameraSizeListener);

    void takePicture(CameraPhotoListener cameraPhotoListener);

    void setVideoFileSize(long videoFileSize);

    void setVideoDuration(int videoDuration);

    void startVideoRecord(File file, CameraVideoListener cameraVideoListener);

    void stopVideoRecord();

    void resumePreview();

    void closeCamera(CameraCloseListener cameraCloseListener);

    void releaseCamera();
}
