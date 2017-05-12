package name.juhasz.judit.udacity.szekesfehervarguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.local_attraction_list, container, false);

        ArrayList<LocalAttraction> restaurants = new ArrayList<>();

        restaurants.add(new LocalAttraction(getString(R.string.restaurant_1_name),
                getString(R.string.restaurant_1_address),
                getString(R.string.restaurant_1_opening_hours), R.drawable.diofa_restaurant));
        restaurants.add(new LocalAttraction(getString(R.string.restaurant_2_name),
                getString(R.string.restaurant_2_address),
                getString(R.string.restaurant_2_opening_hours), R.drawable.szarcsa_restaurant));
        restaurants.add(new LocalAttraction(getString(R.string.restaurant_3_name),
                getString(R.string.restaurant_3_address),
                getString(R.string.restaurant_3_opening_hours), R.drawable.kiskulacs_restaurant));
        restaurants.add(new LocalAttraction(getString(R.string.restaurant_4_name),
                getString(R.string.restaurant_4_address),
                getString(R.string.restaurant_4_opening_hours), R.drawable.kertesz_inn));
        restaurants.add(new LocalAttraction(getString(R.string.restaurant_5_name),
                getString(R.string.restaurant_5_address),
                getString(R.string.restaurant_5_opening_hours), R.drawable.vorosmarty_confectionery));
        restaurants.add(new LocalAttraction(getString(R.string.restaurant_6_name),
                getString(R.string.restaurant_6_address),
                getString(R.string.restaurant_6_opening_hours), R.drawable.soho_restaurant));

        LocalAttractionAdapter adapter = new LocalAttractionAdapter(getActivity(), restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
