package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by Adrian on 7/25/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTransltion;

    public Word(String defaultTranslation, String miwokTransltion) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTransltion = miwokTransltion;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTransltion() {
        return mMiwokTransltion;
    }
}
