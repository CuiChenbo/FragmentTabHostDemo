package choi.ccb.com.fragmenttabhostdemo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import choi.ccb.com.fragmenttabhostdemo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotFragment extends Fragment {


    public HotFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        ((TextView)v.findViewById(R.id.tv)).setText("HotFragment");
        return v;
    }

}
