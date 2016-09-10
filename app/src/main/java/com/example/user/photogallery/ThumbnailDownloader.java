package com.example.user.photogallery;

import android.os.HandlerThread;
import android.util.Log;

/**
 * Created by guang on 2016/9/10.
 */
public class ThumbnailDownloader<T> extends HandlerThread {

    private static final String TAG = "ThumbnailDownloader";
    private Boolean mHasQuit = false;

    public ThumbnailDownloader( ) {
        super(TAG);
    }

    @Override
    public boolean quit() {
        mHasQuit = true;
        return super.quit();
    }

    public void queueThumbnail(T target, String url) {
        Log.i(TAG, "Got a URL:" + url);
    }
}
