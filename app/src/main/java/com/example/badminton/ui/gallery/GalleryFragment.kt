package com.example.badminton.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.badminton.adapter.GalleryAdapter
import com.example.badminton.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.rvgallery1
        recyclerView.adapter = GalleryAdapter(requireContext(), GalleryViewModel().loadData())

        recyclerView = binding.rvgallery2
        recyclerView.adapter = GalleryAdapter(requireContext(), GalleryViewModel().loadData2())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}