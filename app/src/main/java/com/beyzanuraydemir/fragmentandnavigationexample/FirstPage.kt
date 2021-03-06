package com.beyzanuraydemir.fragmentandnavigationexample

import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.beyzanuraydemir.fragmentandnavigationexample.databinding.FragmentFirstPageBinding
import com.beyzanuraydemir.fragmentandnavigationexample.databinding.FragmentSecondPageBinding


class FirstPage : Fragment() {

    private lateinit var fragmentFirstPageBinding: FragmentFirstPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentFirstPageBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_first_page,container,false)
        return fragmentFirstPageBinding.root
       // val view = inflater.inflate(R.layout.fragment_first_page, container, false)
       // return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*val button: Button = view.findViewById(R.id.button)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_firstPage_to_secondPage)
        }*/
        fragmentFirstPageBinding.button.setOnClickListener {
            findNavController().navigate(R.id.action_firstPage_to_secondPage)
        }
    }


}