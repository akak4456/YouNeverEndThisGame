package com.adele.youneverendthisgame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.adele.youneverendthisgame.MainActivity
import com.adele.youneverendthisgame.R
import com.adele.youneverendthisgame.SceneCode

abstract class CommonFragment<VB: ViewDataBinding>(@LayoutRes private val layoutRes: Int): Fragment() {
    lateinit var binding: VB
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
        initBinding()
        return binding.root
    }
    abstract fun initBinding()
    fun changeScene(target: SceneCode) {
        (activity as? MainActivity)?.changeScene(target)
    }
}