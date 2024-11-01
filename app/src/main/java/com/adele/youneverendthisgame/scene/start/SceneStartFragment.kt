package com.adele.youneverendthisgame.scene.start

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.adele.youneverendthisgame.R
import com.adele.youneverendthisgame.SceneCode
import com.adele.youneverendthisgame.databinding.FragmentSceneStartBinding
import com.adele.youneverendthisgame.scene.CommonFragment

class SceneStartFragment : CommonFragment<FragmentSceneStartBinding>(R.layout.fragment_scene_start) {
    override fun initBinding() {
        binding.tvStart.setOnClickListener {
            changeScene(SceneCode.SCENE_TICTACTOE_INTRO)
        }
    }

}