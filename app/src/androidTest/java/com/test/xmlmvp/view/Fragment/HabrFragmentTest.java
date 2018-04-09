package com.test.xmlmvp.view.Fragment;

import android.os.SystemClock;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingPolicies;
import android.support.test.espresso.PerformException;
import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.espresso.util.HumanReadables;
import android.support.test.espresso.util.TreeIterables;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import com.test.xmlmvp.R;
import com.test.xmlmvp.view.Activity.MainActivity;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
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
        onView(withId(R.id.swipeContainer)).perform(ViewActions.swipeDown());
        SystemClock.sleep(5000);
        onView(withId(R.id.habrList)).perform(ViewActions.swipeUp());
        onView(withId(R.id.habrList)).perform(ViewActions.swipeDown());
    }

    @Test
    public void showError() throws Exception {
    }

}