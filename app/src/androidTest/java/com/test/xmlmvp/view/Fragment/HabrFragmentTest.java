package com.test.xmlmvp.view.Fragment;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import com.test.xmlmvp.R;
import com.test.xmlmvp.view.Activity.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dzhafar on 09.04.18.
 */
public class HabrFragmentTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void onCreate() throws Exception {
    }

    @Test
    public void onCreateView() throws Exception {
    }

    @Test
    public void onSuccessRequest() throws Exception {
        Espresso.onView(ViewMatchers.withId(R.id.swipeContainer)).perform(ViewActions.swipeDown());
        Espresso.onView(ViewMatchers.withId(R.id.habrList)).perform(ViewActions.swipeUp());
        Espresso.onView(ViewMatchers.withId(R.id.habrList)).perform(ViewActions.swipeDown());
    }

    @Test
    public void showError() throws Exception {
    }

}