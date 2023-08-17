package com.example.opsc7312icetask2pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //You'll also set up the BottomNavigationView and its click listeners to switch between fragments.
        val intent = Intent(this,MenuBar::class.java)
        startActivity(intent)
        //you'll set up the fragment container and load the PetStatusFragment initially.
        //if (savedInstanceState == null) {
            //supportFragmentManager.commit {
                //setReorderingAllowed(true)
                ///add<PetStatusFragment>(R.id.fragment_pet_status)
            //}
    }
}