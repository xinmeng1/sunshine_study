package com.example.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }
    private ArrayAdapter<String> mForecastAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        //教程里里面是通过代码加载的fragment,这里fragment直接写到了activity_main.xml中
        String [] forecastArray = new String[]{
                "Today - Sunny - 88/63",
                "Tomorrow - Sunny - 88/63",
                "Weds - Sunny - 88/63",
                "Thurs - Sunny - 88/63",
                "Fri - Sunny - 88/63",
                "Sat - Sunny - 88/63",
                "Sun - Sunny - 88/63"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));
        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast
        );

        ListView listView = (ListView) view.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return view;
    }
}
