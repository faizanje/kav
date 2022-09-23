package com.hfdevs.kav.ui.fragment.tabneworder.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.hfdevs.kav.R

import com.hfdevs.kav.ui.fragment.tabneworder.TabNewOrderFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3,
    R.string.tab_text_4,
    R.string.tab_text_5,

)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return TabNewOrderFragment()
            }
            1 -> {
                return PlaceholderFragment.newInstance(position)
            }
            2 -> {
                return PlaceholderFragment.newInstance(position )
            }
            3 -> {
                return PlaceholderFragment.newInstance(position )
            }
            4 -> {
                return PlaceholderFragment.newInstance(position )
            }
            else -> {
                return PlaceholderFragment.newInstance(position )
            }
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {

        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        TAB_TITLES.reverse()
        // Show 2 total pages.
        return TAB_TITLES.size
    }
}