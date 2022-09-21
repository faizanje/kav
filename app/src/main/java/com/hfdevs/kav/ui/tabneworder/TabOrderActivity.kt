package com.hfdevs.kav.ui.tabneworder

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import androidx.viewpager2.widget.ViewPager2

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.hfdevs.kav.databinding.ActivityTabOrderBinding
import com.hfdevs.kav.ui.tabneworder.ui.main.SectionsPagerAdapter


class TabOrderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTabOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTabOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
//        tabs.addTab(tabs.newTab().setText("Today"))
//        tabs.addTab(tabs.newTab().setText("Tomorrow"))
//        tabs.addTab(tabs.newTab().setText("Jun 23, 2022"))
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



//        binding.viewPager.registerOnPageChangeCallback(object : OnPageChangeCallback() {
//            override fun onPageSelected(position: Int) {
//                tabs.selectTab(tabs.getTabAt(position))
//            }
//        })

    }
}