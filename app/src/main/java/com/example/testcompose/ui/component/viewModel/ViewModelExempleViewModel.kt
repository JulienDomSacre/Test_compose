package com.example.testcompose.ui.component.viewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ViewModelExampleViewModel: ViewModel() {
    private val _state = MutableStateFlow(Result(ResultStatus.Success))
    val state: StateFlow<Result>
        get() = _state

    fun changeState(){
        _state.value = if(state.value.resultStatus == ResultStatus.Success){
            Result(ResultStatus.Error)
        }else {
            Result(ResultStatus.Success)
        }
    }
}

class Result(
    val resultStatus: ResultStatus
)

enum class ResultStatus {
    Success,
    Error
}