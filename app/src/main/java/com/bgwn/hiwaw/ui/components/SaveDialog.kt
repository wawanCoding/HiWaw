package com.bgwn.hiwaw.ui.components

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.bgwn.hiwaw.databinding.CustomDialogBinding

class SaveDialog(
    private val onSaveClickListener : (String) -> Unit
) : DialogFragment(){

    private lateinit var binding: CustomDialogBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = CustomDialogBinding.inflate(layoutInflater)

        val builder = AlertDialog.Builder(requireActivity())
        builder.setView(binding.root)

        binding.btnSaveContact.setOnClickListener {
            onSaveClickListener.invoke(binding.editTextCustomerName.text.toString())
        }

        val dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return dialog
    }
}