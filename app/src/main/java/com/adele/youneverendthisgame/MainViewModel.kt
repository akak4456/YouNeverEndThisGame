package com.adele.youneverendthisgame

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _curSceneLayoutCode: MutableLiveData<SceneCode> = MutableLiveData(SceneCode.SCENE_START)
    val curSceneLayoutCode: LiveData<SceneCode> = _curSceneLayoutCode

    fun changeCurSceneLayoutCode(sceneCode: SceneCode) {
        _curSceneLayoutCode.value = sceneCode
    }
}