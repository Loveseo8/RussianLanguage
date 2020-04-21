package com.add.russianlanguage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    // TURGENEV
    Button turgenevbutton;
    ImageView turgenevtxt;
    int turgenevcount = 0;

    //TOLSTOY
    Button tolstoybutton;
    ImageView tolstoytxt;
    int tolstoycount = 0;

    //KUPRIN
    Button kuprinbutton;
    ImageView kuprintxt;
    int kuprincount = 0;

    //PUSHKIN
    Button pushkinbutton;
    ImageView pushkintxt;
    int pushkincount = 0;

    //NEXT
    Button next;
    ImageView r;

    //LEVEL
    ImageView level1;
    ImageView level2;
    Button level1button;
    Button level2button;
    TextView doing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText) findViewById(R.id.name);
        String person = name.getText().toString();

        // TURGENEV
        turgenevtxt = (ImageView) findViewById(R.id.turgenevtxt);
        turgenevtxt.setVisibility(View.INVISIBLE);
        turgenevbutton = (Button) findViewById(R.id.turgenevbutton);
        turgenevbutton.setVisibility(View.VISIBLE);
        turgenevbutton.setBackgroundColor(Color.TRANSPARENT);
        turgenevbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turgenevcount == 0){
                    turgenevtxt.setVisibility(View.VISIBLE);
                    turgenevcount = 1;
                } else {
                    turgenevtxt.setVisibility(View.INVISIBLE);
                    turgenevcount = 0;
                }
            }
        });

        //TOLSTOY
        tolstoytxt = (ImageView) findViewById(R.id.tolstoytxt);
        tolstoytxt.setVisibility(View.INVISIBLE);
        tolstoybutton = (Button) findViewById(R.id.tolstoybutton);
        tolstoybutton.setVisibility(View.VISIBLE);
        tolstoybutton.setBackgroundColor(Color.TRANSPARENT);
        tolstoybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tolstoycount == 0){
                    tolstoytxt.setVisibility(View.VISIBLE);
                    tolstoycount = 1;
                } else {
                    tolstoytxt.setVisibility(View.INVISIBLE);
                    tolstoycount = 0;
                }
            }
        });

        //KUPRIN
        kuprintxt = (ImageView) findViewById(R.id.kuprintxt);
        kuprintxt.setVisibility(View.INVISIBLE);
        kuprinbutton = (Button) findViewById(R.id.kuprinbutton);
        kuprinbutton.setVisibility(View.VISIBLE);
        kuprinbutton.setBackgroundColor(Color.TRANSPARENT);
        kuprinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kuprincount == 0){
                    kuprintxt.setVisibility(View.VISIBLE);
                    kuprincount = 1;
                } else {
                    kuprintxt.setVisibility(View.INVISIBLE);
                    kuprincount = 0;
                }
            }
        });

        //PUSHKIN
        pushkintxt = (ImageView) findViewById(R.id.pushkintxt);
        pushkintxt.setVisibility(View.INVISIBLE);
        pushkinbutton = (Button) findViewById(R.id.pushkinbutton);
        pushkinbutton.setVisibility(View.VISIBLE);
        pushkinbutton.setBackgroundColor(Color.TRANSPARENT);
        pushkinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pushkincount == 0){
                    pushkintxt.setVisibility(View.VISIBLE);
                    pushkincount = 1;
                } else {
                    pushkintxt.setVisibility(View.INVISIBLE);
                    pushkincount = 0;
                }
            }
        });

        //NEXT
        r = (ImageView) findViewById(R.id.r);
        next = (Button) findViewById(R.id.next);
        next.setVisibility(View.VISIBLE);
        next.setBackgroundColor(Color.TRANSPARENT);

        //LEVEL
        level1 = (ImageView) findViewById(R.id.level1);
        level2 = (ImageView) findViewById(R.id.level2);
        level1.setVisibility(View.INVISIBLE);
        level2.setVisibility(View.INVISIBLE);
        level1button = (Button) findViewById(R.id.level1button);
        level2button = (Button) findViewById(R.id.level2button);
        level1button.setVisibility(View.INVISIBLE);
        level2button.setVisibility(View.INVISIBLE);
        doing = (TextView) findViewById(R.id.doing);
        doing.setText(person + " выполняет тест");
        doing.setVisibility(View.INVISIBLE);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next.setVisibility(View.INVISIBLE);
                r.setVisibility(View.INVISIBLE);
                name.setVisibility(View.INVISIBLE);

                level1.setVisibility(View.VISIBLE);
                level2.setVisibility(View.VISIBLE);
                level1button.setVisibility(View.VISIBLE);
                level2button.setVisibility(View.VISIBLE);
                level1button.setBackgroundColor(Color.TRANSPARENT);
                level2button.setBackgroundColor(Color.TRANSPARENT);
                doing.setVisibility(View.VISIBLE);
            }
        });


        level1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Level1.class);
                startActivity(i);
            }
        });

        level2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Level2.class);
                startActivity(i);
            }
        });
    }
}
