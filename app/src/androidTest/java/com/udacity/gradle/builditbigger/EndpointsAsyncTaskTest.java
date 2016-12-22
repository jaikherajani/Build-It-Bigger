package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 *
 * Udacity-builditbigger
 * Created on 22/12/2016 by Jai K Kherajani
 */

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Test
    public void testDoInBackground() throws Exception{
        com.udacity.gradle.builditbigger.MainActivityFragment fragment = new com.udacity.gradle.builditbigger.MainActivityFragment();
        fragment.testFlag = true;
        new EndpointsAsyncTask(fragment).execute();
        Thread.sleep(5000);
        System.out.println("Error: Fetched Joke = " + fragment.returnJoke());
        assertTrue("Error: Fetched Joke = " + fragment.returnJoke(), fragment.returnJoke() != null);
    }
}