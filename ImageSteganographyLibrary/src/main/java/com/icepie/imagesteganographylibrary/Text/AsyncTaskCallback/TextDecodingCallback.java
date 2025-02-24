package com.icepie.imagesteganographylibrary.Text.AsyncTaskCallback;

import com.icepie.imagesteganographylibrary.Text.ImageSteganography;

/**
 * This the callback interface for TextDecoding AsyncTask.
 */

public interface TextDecodingCallback {

    void onStartTextEncoding();

    void onCompleteTextEncoding(ImageSteganography result);

}
