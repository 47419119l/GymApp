package com.example.sandra.gymapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class SesionsFragment extends Fragment {
    private FragmentTabHost tabHost;
    public SesionsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sesions, container, false);
        tabHost= (FragmentTabHost) rootView.findViewById(android.R.id.tabhost);
        tabHost.setup(getActivity(), getFragmentManager(), android.R.id.tabcontent);

        //Creem les pestanyes
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Especiales"), SesionsEspecials.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Ordinarias"), SesionesOrdinarias.class, null);

        return rootView;
    }
}
