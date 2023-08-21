package com.example.opsc7312icetask2pet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class PetInteractionFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        //val Interactionimage: ImageView = petinteraction.findViewById(R.id.Interactionimage)
        //Interactionimage.setImageResource(android.R.drawable.resource_default)

        val petinteraction = inflater.inflate(R.layout.fragment_pet_interaction, container, false)
        val txtcurrenthunger: TextView = petinteraction.findViewById(R.id.txtcurrenthunger)
        val txtcurrentplay: TextView = petinteraction.findViewById(R.id.txtcurrentplay)
        val txtcurrentclean: TextView = petinteraction.findViewById(R.id.txtcurrentclean)
        val btnfeed: Button = petinteraction.findViewById(R.id.btnfeed)
        val btnplay: Button = petinteraction.findViewById(R.id.btnplay)
        val btnclean: Button = petinteraction.findViewById(R.id.btnclean)
        txtcurrenthunger.text = pet.hunger.toString()
        txtcurrentplay.text = pet.happiness.toString()
        txtcurrentclean.text = pet.cleanliness.toString()
        val Interactionimage: ImageView = petinteraction.findViewById(R.id.Interactionimage)
        //Interactionimage.setImageResource(android.R.drawable.resource_default)

        btnfeed.setOnClickListener(){
            pet.hunger++
             txtcurrenthunger.text = pet.hunger.toString()
            Interactionimage.setImageResource(R.drawable.feed)
        }
        btnplay.setOnClickListener(){
            pet.happiness++
            txtcurrentplay.text = pet.happiness.toString()
            Interactionimage.setImageResource(R.drawable.play)
        }
        btnclean.setOnClickListener(){
            pet.cleanliness++
            txtcurrentclean.text = pet.cleanliness.toString()
            Interactionimage.setImageResource(R.drawable.clean)
        }
        return petinteraction
    }
}