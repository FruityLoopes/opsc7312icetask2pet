package com.example.opsc7312icetask2pet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

val Frag1 = PetStatusFragment()
val Frag2 = PetInteractionFragment()
private val Delay: Long = 20000
    var check = false
class MenuBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_bar)


        replaceFrag(Frag1)
        val bottomNav = findViewById<BottomNavigationView>(R.id.NavBar)
        bottomNav.setOnItemSelectedListener{
            when(it.itemId){
                R.id.ic_pet_status->replaceFrag(Frag1)
                R.id.ic_pet_interaction->replaceFrag(Frag2)
            }
            true
        }


    }
    private fun replaceFrag(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, fragment)
            transaction.commit()
        }
}
}