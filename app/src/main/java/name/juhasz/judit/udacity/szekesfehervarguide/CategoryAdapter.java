package name.juhasz.judit.udacity.szekesfehervarguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter{

    private static final int POSITION_ATTRACTION = 0;
    private static final int POSITION_EVENT = 1;
    private static final int POSITION_ACCOMODATION = 2;
    private static final int POSITION_RESTAURANT = 3;

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (POSITION_ATTRACTION == position) {
            return new AttractionFragment();
        } else if (POSITION_EVENT == position) {
            return new EventsFragment();
        } else if (POSITION_ACCOMODATION == position) {
            return new AccomodationFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return POSITION_RESTAURANT + 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (POSITION_ATTRACTION == position) {
            return mContext.getString(R.string.attraction_fragment_title);
        } else if (POSITION_EVENT == position) {
            return mContext.getString(R.string.events_fragment_title);
        } else if (POSITION_ACCOMODATION == position) {
            return mContext.getString(R.string.accomodation_fragment_title);
        } else {
            return mContext.getString(R.string.restaurants_fragment_title);
        }
    }
}
