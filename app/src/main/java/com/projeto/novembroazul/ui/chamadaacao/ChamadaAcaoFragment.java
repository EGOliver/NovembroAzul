package com.projeto.novembroazul.ui.chamadaacao;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.projeto.novembroazul.databinding.FragmentChamadaacaoBinding;


public class ChamadaAcaoFragment extends Fragment {

    private FragmentChamadaacaoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ChamadaAcaoViewModel chamadaAcaoViewModel =
                new ViewModelProvider(this).get(ChamadaAcaoViewModel.class);

        binding = FragmentChamadaacaoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textChamadaAcao;
        chamadaAcaoViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}