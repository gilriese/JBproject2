package com.gilriz.jbproject2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }

    Boolean x;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        EditText ET = (EditText) v.findViewById(R.id.SearchText);

        boolean checked = ((RadioButton) v).isChecked();

        // Check which radio button was clicked
        switch (v.getId()) {
            case R.id.radioIdHere:
                if (checked)
                    ET.setHint("Enter the food you are searching i.e. Pizza");
                break;
            case R.id.radioIdDifferent:
                if (checked)
                    ET.setHint("Enter the food and city you are searching i.e. Pizza in New York");
                x = false;

                break;

        }
        ((Button) v.findViewById(R.id.BtnSearch)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x.equals(false)) {

                }
                else {

                }

            }
        });
        return v;
    }

    public void SearchFoodThere() {

    }


}


