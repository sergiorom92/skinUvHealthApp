package com.example.sergio.skinuvhealth;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentStartFour extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_start_four, container, false);
        Button cerrar = (Button) rootView.findViewById(R.id.buttonComenzar);
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 =  new Intent(getActivity(), MainActivity2.class);
                getActivity().startActivity(intent1);
                getActivity().finish();

            }
        });

        return rootView;
    }
}
