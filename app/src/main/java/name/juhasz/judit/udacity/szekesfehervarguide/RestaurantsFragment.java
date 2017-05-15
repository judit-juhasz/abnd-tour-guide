package name.juhasz.judit.udacity.szekesfehervarguide;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_local_attraction, container, false);

        final ArrayList<LocalAttraction> restaurants = new ArrayList<>();

        final String[] restaurantNames = getResources().getStringArray(R.array.list_restaurant_names);
        final String[] restaurantAddresses = getResources().getStringArray(R.array.list_restaurant_addresses);
        final String[] restaurantOpeningHours = getResources().getStringArray(R.array.list_restaurant_opening_hours);
        final TypedArray restaurantImages = getResources().obtainTypedArray(R.array.list_restaurant_images);

        for  (int id = 0; id != restaurantNames.length; ++id) {
            LocalAttraction newLocalAttraction = new LocalAttraction(restaurantNames[id], restaurantAddresses[id],
                    restaurantOpeningHours[id], restaurantImages.getDrawable(id));
            restaurants.add(newLocalAttraction);
        }

        LocalAttractionAdapter adapter = new LocalAttractionAdapter(getActivity(), restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list_local_attraction);

        listView.setAdapter(adapter);

        return rootView;
    }
}
