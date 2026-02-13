package com.example.news;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class NewsFragment extends Fragment {

    static NewsFragment newInstance(String text) {
        NewsFragment f = new NewsFragment();
        Bundle b = new Bundle();
        b.putString("text", text);
        f.setArguments(b);
        return f;
    }

    public View onCreateView(android.view.LayoutInflater inflater,
                             android.view.ViewGroup container,
                             Bundle savedInstanceState) {

        TextView tv = new TextView(getContext());
        tv.setText(getArguments().getString("text"));
        tv.setTextSize(22);
        tv.setGravity(Gravity.CENTER);
        return tv;
    }
}