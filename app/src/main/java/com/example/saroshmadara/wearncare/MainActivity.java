package com.example.saroshmadara.wearncare;

import android.graphics.Point;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);



        TextView textView = (TextView) findViewById(R.id.textViewid);




        int height$TextView = displayMetrics.heightPixels * 40 / 100;

        textView.getLayoutParams().height = height$TextView;


        textView.getTop();


//        RelativeLayout layout = (RelativeLayout) findViewById(R.id.relativeLayout);
//        layout.getLayoutParams().height = displayMetrics.heightPixels - height$TextView;


//        Toast.makeText(this,displayMetrics.widthPixels  + "   "+ displayMetrics.heightPixels, Toast.LENGTH_LONG).show();
//        int forthQuadrantX = displayMetrics.heightPixels / 3;
//        int forthQuadrantY = displayMetrics.widthPixels / 3;
//
//        ImageView iV1 = (ImageView) findViewById(R.id.iV1);
//        iV1.getLayoutParams().width = forthQuadrantX;
//        iV1.getLayoutParams().height = (int) (1.33*forthQuadrantY);
//        Picasso.with(this).load(R.drawable.deal1).resize(iV1.getLayoutParams().width, iV1.getLayoutParams().height ).into(iV1);
//
//        ImageView iV2 = (ImageView) findViewById(R.id.iV2);
//        iV2.getLayoutParams().width = forthQuadrantX;
//        iV2.getLayoutParams().height = (int) (1.33*forthQuadrantY);
//        Picasso.with(this).load(R.drawable.deal2).resize(iV2.getLayoutParams().width, iV2.getLayoutParams().height).into(iV2);
//
//        ImageView iV3 = (ImageView) findViewById(R.id.iV3);
//        iV3.getLayoutParams().width = forthQuadrantX;
//        iV3.getLayoutParams().height = (int) (1.33*forthQuadrantY);
//        Picasso.with(this).load(R.drawable.deal3).resize(iV3.getLayoutParams().width, iV3.getLayoutParams().height).into(iV3);
//
//        ImageView iV4 = (ImageView) findViewById(R.id.iV4);
//        iV4.getLayoutParams().width = forthQuadrantX;
//        iV4.getLayoutParams().height = (int) (1.33*forthQuadrantY);
//        Picasso.with(this).load(R.drawable.deal4).resize(iV4.getLayoutParams().width, iV4.getLayoutParams().height).into(iV4);


    }
}


