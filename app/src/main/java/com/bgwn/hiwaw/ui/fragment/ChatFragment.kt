package com.bgwn.hiwaw.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat
import com.bgwn.hiwaw.databinding.FragmentChatBinding
import com.bgwn.hiwaw.ui.components.SaveDialog


class ChatFragment : Fragment() {

    private lateinit var btnSave: Button
    private lateinit var edTNumberPhone: EditText
    private lateinit var edTCostPaket: EditText
    private lateinit var swtMode: SwitchCompat
    private var _binding: FragmentChatBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentChatBinding.inflate(layoutInflater)
        btnSave = binding.btnSaveContact
        edTNumberPhone = binding.editTextNomorHp
        edTCostPaket = binding.editTextCostPaket
        swtMode = binding.switchMode
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSave.setOnClickListener {
            openDialog()
        }

    }

    private fun openDialog() {
        val dialog = SaveDialog(onSaveClickListener = {
            Toast.makeText(context, "$it Berhasil di simpan bung", Toast.LENGTH_SHORT).show()
        })
        dialog.show(parentFragmentManager, "Dialog")
    }

}