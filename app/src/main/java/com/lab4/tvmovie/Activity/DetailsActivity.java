package com.lab4.tvmovie.Activity;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.lab4.tvmovie.R;
import com.lab4.tvmovie.Fragment.VideoDetailsFragment;

/*
 * Details activity class that loads LeanbackDetailsFragment class
 */
public class DetailsActivity extends FragmentActivity {
    public static final String SHARED_ELEMENT_NAME = "hero";
    public static final String MOVIE = "Movie";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.details_fragment, new VideoDetailsFragment())
                    .commitNow();
        }
    }

}