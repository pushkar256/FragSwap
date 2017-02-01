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

public class Fragment1 extends Fragment{

    //public String name1;
   // View view;
    public EditText et_namefrag1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_1,container,false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et_namefrag1=(EditText)view.findViewById(R.id.et_name1);

    }

   /* public void setName(String str)
    {
        name1=((EditText)view.findViewById(R.id.et_name1)).getText().toString();
        et_name.setText(str);
    }*/


}
