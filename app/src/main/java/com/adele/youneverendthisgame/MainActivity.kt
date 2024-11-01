package com.adele.youneverendthisgame

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.adele.youneverendthisgame.databinding.ActivityMainBinding
import com.adele.youneverendthisgame.scene.start.SceneStartFragment

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        mainViewModel.curSceneLayoutCode.observe(this) { sceneCode ->
            if(sceneCode != null) {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.main, sceneCode.getFragment())
                transaction.commit()
            } else {
                throw Exception("scene code must not be null!!!")
            }
        }
    }

    fun changeScene(target: SceneCode) {
        mainViewModel.changeCurSceneLayoutCode(target)
    }
}