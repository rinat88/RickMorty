package com.example.myapplication.ui.activity

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: CharacterRepository
) : ViewModel() {
}