package com.example.opsc7312icetask2pet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PetInteractionFragment : Fragment() {

    var feed:Int=1
    var play:Int=1
    var clean:Int=1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val petinteraction = inflater.inflate(R.layout.fragment_pet_interaction, container, false)
        val txtcurrenthunger: TextView = petinteraction.findViewById(R.id.txtcurrenthunger)
        val txtcurrentplay: TextView = petinteraction.findViewById(R.id.txtcurrentplay)
        val txtcurrentclean: TextView = petinteraction.findViewById(R.id.txtcurrentclean)
        val btnfeed: Button = petinteraction.findViewById(R.id.btnfeed)
        val btnplay: Button = petinteraction.findViewById(R.id.btnplay)
        val btnclean: Button = petinteraction.findViewById(R.id.btnclean)

        btnfeed.setOnClickListener(){
             txtcurrenthunger.text = feed++.toString()
        }
        btnplay.setOnClickListener(){
            txtcurrentplay.text = play++.toString()
        }
        btnclean.setOnClickListener(){
            txtcurrentplay.text = clean++.toString()
        }
        return petinteraction
    }
}