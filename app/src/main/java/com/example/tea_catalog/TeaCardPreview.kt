package com.example.tea_catalog

import android.R.id.message
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class TeaCardPreview : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tea_card_preview_black, container, false)
    }

    fun onCardClick(v: View) {
        val intent = Intent(requireActivity().baseContext, HomeScreenActivity::class.java)
        intent.putExtra("message", message)
        requireActivity().startActivity(intent)
    }
}