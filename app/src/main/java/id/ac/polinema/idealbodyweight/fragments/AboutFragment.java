package id.ac.polinema.idealbodyweight.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.ac.polinema.idealbodyweight.R;


public class AboutFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    private static final String ARG_NAME = "name";

    // TODO: Rename and change types of parameters
    private String name;

    public AboutFragment() {
    }

    // TODO: Rename and change types and number of parameters
    public static AboutFragment newInstance(String name) {
        AboutFragment fragment = new AboutFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(ARG_NAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        TextView nameText = view.findViewById(R.id.text_name);
        nameText.setText(name);
        return view;
    }

}
