package name.juhasz.judit.udacity.szekesfehervarguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.local_attraction_list, container, false);

        ArrayList<LocalAttraction> events = new ArrayList<>();

        events.add(new LocalAttraction(getString(R.string.event_1_name),
                getString(R.string.event_1_address),
                getString(R.string.event_1_opening_hours), R.drawable.iron_and_fire_festival));
        events.add(new LocalAttraction(getString(R.string.event_2_name),
                getString(R.string.event_2_address),
                getString(R.string.event_2_opening_hours), R.drawable.fezen));
        events.add(new LocalAttraction(getString(R.string.event_3_name),
                getString(R.string.event_3_address),
                getString(R.string.event_3_opening_hours), R.drawable.royal_days));
        events.add(new LocalAttraction(getString(R.string.event_4_name),
                getString(R.string.event_4_address),
                getString(R.string.event_4_opening_hours), R.drawable.flying_day));
        events.add(new LocalAttraction(getString(R.string.event_5_name),
                getString(R.string.event_5_address),
                getString(R.string.event_5_opening_hours), R.drawable.national_army_festival));
        events.add(new LocalAttraction(getString(R.string.event_6_name),
                getString(R.string.event_6_address),
                getString(R.string.event_6_opening_hours), R.drawable.advent));

        LocalAttractionAdapter adapter = new LocalAttractionAdapter(getActivity(), events);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
