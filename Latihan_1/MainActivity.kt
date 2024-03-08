package com.example.tugaspam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragmentOne = CounterFragment()
        val fragment = supportFragmentManager.findFragmentByTag(CounterFragment::class.java.simpleName)

        if (fragment !is CounterFragment) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, mFragmentOne, CounterFragment::class.java.simpleName)
                .commit()
        }
    }
}