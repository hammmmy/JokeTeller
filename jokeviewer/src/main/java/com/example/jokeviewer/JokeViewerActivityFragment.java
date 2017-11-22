package com.example.jokeviewer;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeViewerActivityFragment extends Fragment {

    public JokeViewerActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_joke_viewer, container, false);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(JokeViewerActivity.EXTRA_JOKE);

        TextView textView = root.findViewById(R.id.joke);
        textView.setText(TextUtils.isEmpty(joke) ? "" : joke);
        return root;
    }
}
