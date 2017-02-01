package com.example.cbluser22.fragswap.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.cbluser22.fragswap.R;

/**
 * Created by cbluser22 on 1/2/17.
 */


    public class Fragment2 extends Fragment {

   // View view;
    //public String name2;
    public EditText et_namefrag2;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et_namefrag2=(EditText)view.findViewById(R.id.et_name2);

    }

   /* public void setName(String str)
    {
        name2=((EditText)view.findViewById(R.id.et_name2)).getText().toString();
        et_name.setText(str);
    }*/
}