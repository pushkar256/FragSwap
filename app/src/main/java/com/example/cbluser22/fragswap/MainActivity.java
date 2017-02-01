package com.example.cbluser22.fragswap;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.cbluser22.fragswap.fragments.Fragment1;
import com.example.cbluser22.fragswap.fragments.Fragment2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    EditText etName1,etName2;
    String name1,name2;
    Button btnSwap;
    Fragment1 fragment1;
    Fragment2 fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setToolbar(toolbar);



        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction().add(R.id.fl_1,fragment1,"tag1");
        transaction.commit();


        FragmentTransaction transaction2=manager.beginTransaction().add(R.id.fl_2,fragment2,"tag2");
        transaction2.commit();

        btnSwap.setOnClickListener(this);

    }

    public void init()
    {
        fragment1=new Fragment1();
        fragment2=new Fragment2();
        toolbar=(Toolbar)findViewById(R.id.tb_toolbar);
        btnSwap=(Button)findViewById(R.id.btn_swap);
    }

    public void setToolbar(Toolbar toolbar) {

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }



    @Override
    public void onClick(View v) {

        Fragment1 fragment1=(Fragment1) getSupportFragmentManager().findFragmentByTag("tag1");
        String name1=fragment1.et_namefrag1.getText().toString().trim();

        Fragment2 fragment2= (Fragment2) getSupportFragmentManager().findFragmentByTag("tag2");
        String name2=fragment2.et_namefrag2.getText().toString().trim()+"";

        fragment1.et_namefrag1.setText(name2);
        fragment2.et_namefrag2.setText(name1);


    }
}
