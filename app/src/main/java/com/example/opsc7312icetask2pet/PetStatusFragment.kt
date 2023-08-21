package com.example.opsc7312icetask2pet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment


val pet = Pet("Polly");
class PetStatusFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val petStatus = inflater.inflate(R.layout.fragment_pet_status, container, false)
        val name: TextView = petStatus.findViewById(R.id.textViewName)
        val hunger: TextView = petStatus.findViewById(R.id.textViewHunger)
        val happy: TextView = petStatus.findViewById(R.id.textViewHapp)
        val clean: TextView = petStatus.findViewById(R.id.textViewClean)




        name.text = pet.name
        hunger.text = pet.hunger.toString()
        happy.text = pet.happiness.toString()
        clean.text = pet.cleanliness.toString()

        return petStatus
    }

}