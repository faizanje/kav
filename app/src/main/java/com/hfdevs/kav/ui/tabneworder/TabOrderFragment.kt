package com.hfdevs.kav.ui.tabneworder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import androidx.viewpager2.widget.ViewPager2

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.hfdevs.kav.databinding.FragmentTabOrderBinding
import com.hfdevs.kav.ui.tabneworder.ui.main.SectionsPagerAdapter


class TabOrderFragment : Fragment() {

    private lateinit var binding: FragmentTabOrderBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabOrderBinding.inflate(layoutInflater)
        val sectionsPagerAdapter = SectionsPagerAdapter(requireContext(), childFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs

        tabs.setupWithViewPager(viewPager)
        binding.btnSearch.setOnClickListener{view->
            binding.tbLayout.visibility= View.GONE
            binding.etSearch.visibility= View.VISIBLE
        }
        binding.etSearch.setStartIconOnClickListener{view->
            binding.tbLayout.visibility= View.VISIBLE
            binding.etSearch.visibility= View.GONE

        }

        tabs.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
        return binding.root
    }
}