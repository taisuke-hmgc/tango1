package com.example.tango;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    CusutomWord apple;

    LinearLayout container;
    TextView nameTextView;

    CusutomWord[] cusutomWords;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        container = (LinearLayout)findViewById(R.id.container);
        CusutomWord apple= new CusutomWord(R.drawable.apple_icon, "apple","りんご");

        //配列

        cusutomWords = new CusutomWord[]{
                new CusutomWord(R.drawable.apple_icon, "apple","りんご"),
                new CusutomWord(R.drawable.banana_icon, "banana","バナナ"),
        };
        for (int i = 0; i < 2; i++) {
            addWord(cusutomWords[i]);
        }


        //メソッドの実行

    }
    public void addWord(CusutomWord word){
        LinearLayout layout = new LinearLayout(this.getApplicationContext());
        layout.setOrientation(LinearLayout.HORIZONTAL);

        TextView  nameTextView = new TextView(this);

        nameTextView.setText(word.name);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(word.resId);

        TextView jpnTextView = new TextView(this);
        jpnTextView.setText(word.japanesename);

        layout.addView(imageView);
        layout.addView(nameTextView);
        layout.addView(jpnTextView);

        container.addView(layout);

        for (int i = 0; i<1; i++){


        }

    }
}
