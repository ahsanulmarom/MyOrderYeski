package com.example.user.orderyeski.UITesting;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.user.orderyeski.MainPage;
import com.example.user.orderyeski.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MainPageEspressoTest {

    @Rule
    public ActivityTestRule<MainPage> mActivityRule = new ActivityTestRule<>(MainPage.class);

    @Test
    public void ensureButtonWork() {
        onView(ViewMatchers.withId(R.id.belisekarang)).perform(click());

        ensureButtonAboutWork();
        ensureButtonFaqWork();
        ensureButtonOrderWork();
        ensureButtonMenuWork();
        ensureButtonPromoWork();
    }

    public void ensureButtonAboutWork() {
        onView(withId(R.id.about)).perform(click());
        Espresso.pressBack();
    }


    public void ensureButtonFaqWork() {
        onView(withId(R.id.faq)).perform(click());
        Espresso.pressBack();
    }


    public void ensureButtonPromoWork() {
        onView(withId(R.id.promo)).perform(click());
        Espresso.closeSoftKeyboard();
        Espresso.pressBack();
    }


    public void ensureButtonOrderWork() {
        onView(withId(R.id.order)).perform(click());
        Espresso.pressBack();
    }


    public void ensureButtonMenuWork() {
        onView(withId(R.id.menu)).perform(click());
        Espresso.closeSoftKeyboard();
        Espresso.pressBack();
    }
}
