package com.hfdevs.kav.ui.dialogs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hfdevs.kav.R
import com.hfdevs.kav.databinding.FragmentSocialDialogBinding

class SocialDialogFragment : Fragment() {
    private lateinit var binding:FragmentSocialDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSocialDialogBinding.inflate(inflater,container,false)

        return binding.root
    }
}