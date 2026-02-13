package com.example.layoutoperations;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class TabFragment extends Fragment {

    static TabFragment newInstance(String text) {
        TabFragment f = new TabFragment();
        Bundle b = new Bundle();
        b.putString("text", text);
        f.setArguments(b);
        return f;
    }

    public View onCreateView(android.view.LayoutInflater i,
                             android.view.ViewGroup c,
                             Bundle b) {

        TextView tv = new TextView(getContext());
        tv.setText(getArguments().getString("text"));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        return tv;
    }
}