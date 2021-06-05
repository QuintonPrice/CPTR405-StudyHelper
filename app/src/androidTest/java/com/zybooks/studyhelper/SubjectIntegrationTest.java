package com.zybooks.studyhelper;

import android.view.View;

import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class SubjectIntegrationTest {

    @Rule
    public ActivityScenarioRule<SubjectActivity> mActivityScenarioRule
            = new ActivityScenarioRule<>(SubjectActivity.class);

    @Test
    public void testClickSubject() {

        // Find the RecyclerView in the SubjectActivity
        Matcher<View> viewMatcher = withId(R.id.subjectRecyclerView);
        ViewInteraction viewInteraction = onView(viewMatcher);

        // Click on first subject in RecyclerView
        ViewAction viewAction = actionOnItemAtPosition(0, click());
        viewInteraction.perform(viewAction);
    }
}