package com.example.sergio.skinuvhealth;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_one, container, false);
        ImageView munequito = (ImageView) rootView.findViewById(R.id.imageView4);

        munequito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =  new Intent(getActivity(), SunBurnActivity.class);
                getActivity().startActivity(intent1);
            }
        });
        TextView textito = (TextView)rootView.findViewById(R.id.actividad1);
        textito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =  new Intent(getActivity(), SunBurnActivity.class);
                getActivity().startActivity(intent1);
            }
        });
        View viewLay  = rootView.findViewById(R.id.fragment_list_categories);
        viewLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =  new Intent(getActivity(), SunBurnActivity.class);
                getActivity().startActivity(intent1);
            }
        });

        return rootView;
    }
}
