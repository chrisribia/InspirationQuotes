package com.example.inspirationquotes.ui.QuotesDetails

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.inspirationquotes.R

class QuotesDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = QuotesDetailsFragment()
    }

    private lateinit var viewModel: QuotesDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.quotes_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(QuotesDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
