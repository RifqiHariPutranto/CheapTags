package com.example.cheaptagsapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment


class AboutFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_about, container, false)
        val git = v.findViewById<ImageButton>(R.id.git_btn)
        val git_txt = v.findViewById<TextView>(R.id.git_text)

        git.setOnClickListener {
            val openURL= Intent(android.content.Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://github.com/RifqiHariPutranto/CheapTags")
            startActivity(openURL)
        }
        git_txt.setOnClickListener {
            val openURL= Intent(android.content.Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://github.com/RifqiHariPutranto/CheapTags")
            startActivity(openURL)
        }

        return v
    }


}