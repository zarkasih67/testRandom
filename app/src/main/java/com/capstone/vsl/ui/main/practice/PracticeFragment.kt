package com.capstone.vsl.ui.main.practice

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.capstone.vsl.R
import com.capstone.vsl.databinding.FragmentPracticeBinding
import com.capstone.vsl.ui.main.practice.camera.UploadActivity

class PracticeFragment : Fragment() {

    private lateinit var binding: FragmentPracticeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPracticeBinding.inflate(inflater, container, false)

        val btnTest : Button = binding.btnStart

        btnTest.setOnClickListener {
            val intent = Intent(requireContext(), UploadActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }
}