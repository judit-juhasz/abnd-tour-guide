package name.juhasz.judit.udacity.szekesfehervarguide;

public class LocalAttraction {

    private String mLocalAttractionName;
    private String mLocalAttractionAddress;
    private String mLocalAttractionOpeningHours;
    private int mImageResourceId;

    public LocalAttraction(String localAttractionName, String localAttractionAddress,
                           String localAttractionOpeningHours, int imageResourceId) {
        mLocalAttractionName = localAttractionName;
        mLocalAttractionAddress = localAttractionAddress;
        mLocalAttractionOpeningHours = localAttractionOpeningHours;
        mImageResourceId = imageResourceId;
    }

    public String getmLocalAttractionName() {
        return mLocalAttractionName;
    }

    public String getmLocalAttractionAddress() {
        return mLocalAttractionAddress;
    }

    public String getmLocalAttractionOpeningHours() {
        return mLocalAttractionOpeningHours;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

}
