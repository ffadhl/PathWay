package com.fadhlalhafizh.pathway.app.ui.main.ui.university

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.fadhlalhafizh.pathway.databinding.FragmentUniversityBinding

class UniversityFragment : Fragment() {

    private var _binding: FragmentUniversityBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val universityViewModel =
            ViewModelProvider(this).get(UniversityViewModel::class.java)

        _binding = FragmentUniversityBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textUniversity
        universityViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}