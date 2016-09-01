package com.example.navigationdraweronly;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

/**
 * Created by hp on 9/1/2016.
 */
public class FragmentTwo extends Fragment {
    TextView tv;
    WebView web_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_one, container, false);
        return view;
    }
}