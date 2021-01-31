package com.kdinfotech.messagelibrary

import android.content.Context
import androidx.appcompat.app.AlertDialog

object AlertMessage {

    fun showMessage(context: Context, title:String, message:String, onPositiveButtonCallback:()->Unit){

        AlertDialog.Builder(context)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Close"
            ) { dialog, which -> onPositiveButtonCallback.invoke() }
            .show()
    }
}