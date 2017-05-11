package name.juhasz.judit.udacity.szekesfehervarguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter{

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionFragment();
        } else if (position == 1) {
            return new EventsFragment();
        } else if (position == 2) {
            return new AccomodationFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.attraction_fragment_title);
        } else if (position == 1) {
            return mContext.getString(R.string.events_fragment_title);
        } else if (position == 2) {
            return mContext.getString(R.string.accomodation_fragment_title);
        } else {
            return mContext.getString(R.string.restaurants_fragment_title);
        }
    }
}
