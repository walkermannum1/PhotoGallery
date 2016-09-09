package com.example.user.photogallery;

import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.IOException;

/**
 * Created by user on 2016/9/8.
 */
public class PhotoGalleryFragment extends Fragment {

    private static final String TAG = "PhotoGalleryFragment";
    private RecyclerView mPhotoRecyclerView;

    public static PhotoGalleryFragment newInstance() {
        return new PhotoGalleryFragment();
    }

    private class FetchItemsTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            new PhotoFetcher().fetchItems();
            return null;
        }
    }
}
