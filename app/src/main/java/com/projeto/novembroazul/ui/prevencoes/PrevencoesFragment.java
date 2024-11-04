package com.projeto.novembroazul.ui.prevencoes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.projeto.novembroazul.databinding.FragmentPrevencoesBinding;

public class PrevencoesFragment extends Fragment {

    private FragmentPrevencoesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PrevencoesViewModel prevencoesViewModel =
                new ViewModelProvider(this).get(PrevencoesViewModel.class);

        binding = FragmentPrevencoesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPrevencoes;
        prevencoesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}