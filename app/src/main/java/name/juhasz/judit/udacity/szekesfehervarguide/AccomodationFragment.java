package name.juhasz.judit.udacity.szekesfehervarguide;

import android.content.res.TypedArray;
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

        final ArrayList<LocalAttraction> accomodations = new ArrayList<>();

        final String[] accomodationNames = getResources().getStringArray(R.array.list_accomodation_names);
        final String[] accomodationAddresses = getResources().getStringArray(R.array.list_accomodation_addresses);
        final String[] accomodationOpeningHours = getResources().getStringArray(R.array.list_accomodation_opening_hours);
        final TypedArray accomodationImages = getResources().obtainTypedArray(R.array.list_accomodation_images);

        for  (int id = 0; id != accomodationNames.length; ++id) {
            LocalAttraction newLocalAttraction = new LocalAttraction(accomodationNames[id], accomodationAddresses[id],
                    accomodationOpeningHours[id], accomodationImages.getDrawable(id));
            accomodations.add(newLocalAttraction);
        }

        LocalAttractionAdapter adapter = new LocalAttractionAdapter(getActivity(), accomodations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
