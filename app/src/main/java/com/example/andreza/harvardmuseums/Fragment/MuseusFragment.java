package com.example.andreza.harvardmuseums.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andreza.harvardmuseums.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseusFragment extends Fragment {


    public MuseusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_museus, container, false);
    }

}