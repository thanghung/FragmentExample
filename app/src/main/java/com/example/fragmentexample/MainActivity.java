package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

public class MainActivity extends FragmentActivity
    implements FirstFragment.FirstFragmentListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void onButtonClick(int fontsize, String text) {
            SeconFragment textFragment =
                    (SeconFragment)getSupportFragmentManager().findFragmentById
                    (R.id.second_fragment);
            textFragment.changeTextProperties(fontsize, text);
        }
}
