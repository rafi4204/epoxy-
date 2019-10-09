package com.example.epoxy.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.epoxy.R
import com.example.epoxy.SingleDataController
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {
    private val singleDataController : SingleDataController by lazy{SingleDataController()}

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        recycler_view.layoutManager = LinearLayoutManager(context)
        recycler_view.adapter=singleDataController.adapter
       // addItemDecoration(DividerItemDecoration(context, linearLayoutManager.orientation))
        recycler_view.addItemDecoration(DividerItemDecoration(context,  (recycler_view.layoutManager as LinearLayoutManager).orientation))
        singleDataController.requestModelBuild()
    }


}
