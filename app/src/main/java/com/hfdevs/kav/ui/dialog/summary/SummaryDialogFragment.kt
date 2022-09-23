package com.hfdevs.kav.ui.dialog.summary

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.hfdevs.kav.databinding.FragmentSummaryDialogBinding


class SummaryDialogFragment : DialogFragment() {
    private lateinit var binding:FragmentSummaryDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSummaryDialogBinding.inflate(inflater,container,false)


        binding.btnClose.setOnClickListener{view->
            dialog!!.dismiss()
        }
        getDialog()!!.getWindow()!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))



        getDialog()!!.getWindow()!!.setWindowAnimations(0)
        return binding.root
    }



}