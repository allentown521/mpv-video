package `is`.xyz.mpv

import android.view.LayoutInflater
import android.view.View

interface PickerDialog {
    fun buildView(layoutInflater: LayoutInflater): View

    fun isInteger(): Boolean // eh....

    var number: Double?
}