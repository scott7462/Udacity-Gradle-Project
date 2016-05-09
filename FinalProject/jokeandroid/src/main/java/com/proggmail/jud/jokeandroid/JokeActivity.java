package com.proggmail.jud.jokeandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
/**
 * Copyright (C) 2015 The Android Open Source Project
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class JokeActivity extends AppCompatActivity {

    TextView tVJoke;

    public static String JOKE_TEXT = JokeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        tVJoke = (TextView) findViewById(R.id.tVJoke);
        if (getIntent() != null && getIntent().getExtras().containsKey(JOKE_TEXT)) {
            tellJoke(getIntent().getExtras().getString(JOKE_TEXT));
        }
    }

    public void tellJoke(String text) {
        assert tVJoke != null;
        tVJoke.setText(text);
    }
}
