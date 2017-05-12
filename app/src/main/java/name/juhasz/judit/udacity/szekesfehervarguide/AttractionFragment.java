package name.juhasz.judit.udacity.szekesfehervarguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AttractionFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.local_attraction_list, container, false);

        ArrayList<LocalAttraction> localAttractions = new ArrayList<>();

        localAttractions.add(new LocalAttraction(getString(R.string.attraction_1_name),
                getString(R.string.attraction_1_address),
                getString(R.string.attraction_1_opening_hours), R.drawable.national_memorial_place));
        localAttractions.add(new LocalAttraction(getString(R.string.attraction_2_name),
                getString(R.string.attraction_2_address),
                getString(R.string.attraction_2_opening_hours), R.drawable.orb_and_town_hall_square));
        localAttractions.add(new LocalAttraction(getString(R.string.attraction_3_name),
                getString(R.string.attraction_3_address),
                getString(R.string.attraction_3_opening_hours), R.drawable.bory_castle));
        localAttractions.add(new LocalAttraction(getString(R.string.attraction_4_name),
                getString(R.string.attraction_4_address),
                getString(R.string.attraction_4_opening_hours), R.drawable.st_stephen_cathedral));
        localAttractions.add(new LocalAttraction(getString(R.string.attraction_5_name),
                getString(R.string.attraction_5_address),
                getString(R.string.attraction_5_opening_hours), R.drawable.open_air_museum));
        localAttractions.add(new LocalAttraction(getString(R.string.attraction_6_name),
                getString(R.string.attraction_6_address),
                getString(R.string.attraction_6_opening_hours), R.drawable.flower_clock));

        LocalAttractionAdapter adapter = new LocalAttractionAdapter(getActivity(), localAttractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
