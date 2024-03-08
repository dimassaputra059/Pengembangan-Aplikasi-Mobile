package com.example.tugaspam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class CounterFragment : Fragment() {

    private lateinit var counterTextView: TextView
    private lateinit var plusButton: Button
    private lateinit var minusButton: Button

    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_counter, container, false)

        counterTextView = view.findViewById(R.id.counterTextView)
        plusButton = view.findViewById(R.id.plusButton)
        minusButton = view.findViewById(R.id.minusButton)

        updateCounterText()

        plusButton.setOnClickListener {
            counter++
            updateCounterText()
        }

        minusButton.setOnClickListener {
            counter--
            updateCounterText()
        }

        return view
    }

    private fun updateCounterText() {
        counterTextView.text = counter.toString()
    }
}
