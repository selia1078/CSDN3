package com.example.csdn3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import android.widget.EditText;
import android.widget.TextView;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }
    int size = 30;
    public void bigger(android.view.View v){
        TextView txv;
        txv = (TextView) getView().findViewById(R.id.textView);
        txv.setTextSize(++size);
    }

    public void display(View v){
        EditText name = (EditText) getView().findViewById(R.id.Name);
        TextView text2 = (TextView) getView().findViewById(R.id.textView);
        text2.setText(name.getText().toString());
    }
}