package name.juhasz.judit.udacity.szekesfehervarguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AccomodationFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_local_attraction, container, false);

        ArrayList<LocalAttraction> accomodations = new ArrayList<>();

        accomodations.add(new LocalAttraction(getString(R.string.accomodation_1_name),
                getString(R.string.accomodation_1_address),
                getString(R.string.accomodation_1_opening_hours), R.drawable.hotel_king));
        accomodations.add(new LocalAttraction(getString(R.string.accomodation_2_name),
                getString(R.string.accomodation_2_address),
                getString(R.string.accomodation_2_opening_hours), R.drawable.lakeside_hotel));
        accomodations.add(new LocalAttraction(getString(R.string.accomodation_3_name),
                getString(R.string.accomodation_3_address),
                getString(R.string.accomodation_3_opening_hours), R.drawable.szarcsa_hotel));
        accomodations.add(new LocalAttraction(getString(R.string.accomodation_4_name),
                getString(R.string.accomodation_4_address),
                getString(R.string.accomodation_4_opening_hours), R.drawable.jak));
        accomodations.add(new LocalAttraction(getString(R.string.accomodation_5_name),
                getString(R.string.accomodation_5_address),
                getString(R.string.accomodation_5_opening_hours), R.drawable.kistuba_boarding_house));
        accomodations.add(new LocalAttraction(getString(R.string.accomodation_6_name),
                getString(R.string.accomodation_6_address),
                getString(R.string.accomodation_6_opening_hours), R.drawable.vadaszkurt_hotel));

        LocalAttractionAdapter adapter = new LocalAttractionAdapter(getActivity(), accomodations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
