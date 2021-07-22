package com.turtlecode.fragments_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun first_fragment (view: View) {
        val fragment_manager = supportFragmentManager
        val fragment_transaction = fragment_manager.beginTransaction()
        val first_fragment = first_fragment()
        fragment_transaction.replace(R.id.frameLayout, first_fragment).commit()
    }

    fun second_fragment (view:View) {
        val fragment_manager = supportFragmentManager
        val fragment_transaction = fragment_manager.beginTransaction()
        val second_fragment = second_fragment()
        fragment_transaction.replace(R.id.frameLayout, second_fragment).commit()
    }
}