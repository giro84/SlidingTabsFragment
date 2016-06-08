package com.example.giro.slidingtabsfragment.fragmets;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.giro.slidingtabsfragment.R;

/**
 * Created by giro on 08/06/16.
 */
public class FragmentC extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentc,
                container,
                false);
        return view;
    }


}
