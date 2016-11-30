package com.example.user.orderyeski.UITesting;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.user.orderyeski.MenuMuka;
import com.example.user.orderyeski.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MenuMukaEspressoTest {

    @Rule
    public ActivityTestRule<MenuMuka> mActivityRule = new ActivityTestRule<>(MenuMuka.class);

    @Test
    public void ensureButtonAboutWork() {
        onView(withId(R.id.about)).perform(click());
        onView(withId(R.id.BtnMaps)).perform(click());
        Espresso.pressBack();
    }

    @Test
    public void ensureButtonFaqWork() {
        onView(withId(R.id.faq)).perform(click());
        Espresso.pressBack();
    }

    @Test
    public void ensureButtonPromoWork() {
        onView(withId(R.id.promo)).perform(click());
        onView(withId(R.id.et)).perform(typeText("diskon"));
        onView(withId(R.id.btn)).perform(click());
        Espresso.closeSoftKeyboard();
        Espresso.pressBack();
    }

    @Test
    public void ensureButtonOrderWork() {
        onView(withId(R.id.order)).perform(click());
        onView(withId(R.id.formnama)).perform(typeText("Espresso Test"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.formnotelp)).perform(typeText("123456789"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.formalamat)).perform(typeText("Ini hanya percobaan"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.buttonform)).perform(click());
        onView(withId(R.id.btnNol)).perform(click());
        onView(withId(R.id.btnkonfirm)).perform(click());
        onView(withId(R.id.buttonkonfirmasi)).perform(click());
        onView(withId(R.id.buttonkonfirmasi)).perform(click());
        Espresso.pressBack();
    }

    @Test
    public void ensureButtonMenuWork() {
        onView(withId(R.id.menu)).perform(click());
        onView(withId(R.id.et)).perform(typeText("nasi"));
        onView(withId(R.id.btn)).perform(click());
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.btn)).perform(click());
        Espresso.closeSoftKeyboard();
        Espresso.pressBack();
    }
}
