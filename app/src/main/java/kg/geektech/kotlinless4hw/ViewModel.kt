package kg.geektech.kotlinless4hw

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

class ViewModel :ViewModel(){

    private var counter =0
    val counterDisplayNumberOfClick = MediatorLiveData<Int>()
    val counterDisplayHistory = MediatorLiveData<String>()


    fun onIncrementCLick(){
        counter++
        counterDisplayNumberOfClick.value = counter
        counterDisplayHistory.value = "+"
    }

    fun onDecrementCLick(){
        counter--
        counterDisplayNumberOfClick.value = counter
        counterDisplayHistory.value = "-"
    }



}