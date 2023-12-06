
package com.capstone.vsl.ui.main.moduls

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.capstone.vsl.databinding.FragmentModulsBinding
import com.capstone.vsl.ui.signin.SignInActivity
import com.google.firebase.auth.FirebaseAuth

class ModulsFragment : Fragment() {

    private lateinit var binding: FragmentModulsBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentModulsBinding.inflate(inflater, container, false)

        val ivSignOut : ImageView = binding.ivLogout

        ivSignOut.setOnClickListener {
            signOut()
        }

        return binding.root
    }

    private fun signOut() {
        firebaseAuth = FirebaseAuth.getInstance()
        firebaseAuth.signOut()

        val intent = Intent(requireContext(), SignInActivity::class.java)
        startActivity(intent)
        requireActivity().finish()
    }
}