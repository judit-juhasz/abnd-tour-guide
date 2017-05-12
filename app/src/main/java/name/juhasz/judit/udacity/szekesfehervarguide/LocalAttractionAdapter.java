package name.juhasz.judit.udacity.szekesfehervarguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocalAttractionAdapter  extends ArrayAdapter<LocalAttraction>{

    public LocalAttractionAdapter(Activity context, ArrayList<LocalAttraction> localAttraction) {
        super(context, 0, localAttraction);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        LocalAttraction currentLocalAttraction = getItem(position);

        TextView localAttractionNameTextView = (TextView) listItemView.findViewById(R.id.tv_name);
        localAttractionNameTextView.setText(currentLocalAttraction.getmLocalAttractionName());

        TextView localAttractionAddressTextView = (TextView) listItemView.findViewById(R.id.tv_address);
        localAttractionAddressTextView.setText(currentLocalAttraction.getmLocalAttractionAddress());

        TextView localAttractionOpeningHoursTextView = (TextView) listItemView.findViewById(R.id.tv_opening_hours);
        localAttractionOpeningHoursTextView.setText(currentLocalAttraction.getmLocalAttractionOpeningHours());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.iv_image);
        imageView.setImageResource(currentLocalAttraction.getmImageResourceId());

        return listItemView;
    }

}
