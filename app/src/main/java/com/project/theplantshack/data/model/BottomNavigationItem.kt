package com.project.theplantshack.data.model

import com.project.theplantshack.R

sealed class BottomNavigationItem(var title: String, var icon: Int) {
    object Home : BottomNavigationItem("Home", R.drawable.ic_house)
    object Plant : BottomNavigationItem("Plants", R.drawable.ic_tree)
    object Scan : BottomNavigationItem("Scan", R.drawable.ic_qr_code_scan)
    object Cart : BottomNavigationItem("Cart", R.drawable.ic_shopping)
    object Settings : BottomNavigationItem("Settings", R.drawable.ic_settings)
}
