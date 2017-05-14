package name.juhasz.judit.udacity.szekesfehervarguide;

import android.graphics.drawable.Drawable;

public class LocalAttraction {

    private String mLocalAttractionName;
    private String mLocalAttractionAddress;
    private String mLocalAttractionOpeningHours;
    private Drawable mImageDrawable;

    public LocalAttraction(String localAttractionName, String localAttractionAddress,
                            String localAttractionOpeningHours, Drawable imageDrawable) {
        mLocalAttractionName = localAttractionName;
        mLocalAttractionAddress = localAttractionAddress;
        mLocalAttractionOpeningHours = localAttractionOpeningHours;
        mImageDrawable = imageDrawable;
    }

    public String getLocalAttractionName() {
        return mLocalAttractionName;
    }

    public String getLocalAttractionAddress() {
        return mLocalAttractionAddress;
    }

    public String getLocalAttractionOpeningHours() {
        return mLocalAttractionOpeningHours;
    }

    public Drawable getImageDrawable() {
        return mImageDrawable;
    }

}
