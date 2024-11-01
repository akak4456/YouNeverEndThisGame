package com.adele.youneverendthisgame

import androidx.databinding.ViewDataBinding
import com.adele.youneverendthisgame.scene.CommonFragment
import com.adele.youneverendthisgame.scene.start.SceneStartFragment
import com.adele.youneverendthisgame.scene.tictactoe.intro.SceneTictactoeIntroFragment

enum class SceneCode{
    SCENE_START,
    SCENE_TICTACTOE_INTRO;

    fun getFragment(): CommonFragment<out ViewDataBinding> {
        return when (this) {
            SCENE_START -> SceneStartFragment()
            SCENE_TICTACTOE_INTRO -> SceneTictactoeIntroFragment()
        }
    }
}