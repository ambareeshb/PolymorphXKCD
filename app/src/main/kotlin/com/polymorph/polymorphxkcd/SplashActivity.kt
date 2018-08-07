package com.polymorph.polymorphxkcd

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
/**
 * Created by ambareeshb on 18/03/18.
 * splash screen.
 */
class SplashActivity : AppCompatActivity() {
    private lateinit var handler: Handler
    private lateinit var runnable: Runnable


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        handler = Handler()
    }


    override fun onResume() {
        super.onResume()
        runnable = loadComics()
        handler.postDelayed(runnable, 1000)
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(runnable)
    }


    /**
     * Load main screen containing XKCD comics.
     */
    private fun loadComics(): Runnable = Runnable {
        //todo load main screen.
    }

}

