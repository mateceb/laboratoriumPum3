package com.example.lenovo.laboratoriumpum3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button_change_place)
    Button button_change_place;

    @BindView(R.id.button_change_activity)
    Button button_change_activity;

    @BindView(R.id.city)
    TextView cityTv;

    @BindView(R.id.insert_name)
    EditText insert_name_city;

    @BindView(R.id.picture)
    ImageView obrazek;

    @OnClick(R.id.button_change_place)
    void onClick()
    {

        cityTv.setText(insert_name_city.getText().toString());

    }

    @OnClick(R.id.button_change_activity)
    void onClick1()
    {
        Intent intent = new Intent(this, Main2Activity.class );
        startActivity(intent);

    }

    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Glide.with(getApplicationContext())
                .load("https://cdn.pixabay.com/photo/2013/04/01/09/21/lightning-98499_960_720.png")
                .into(obrazek);

        Intent getData = getIntent();
        Bundle bundle = getIntent().getExtras();


        if (bundle != null) {
            String place = bundle.getString("CityName");
            cityTv.setText(place);
        }
    }












}
