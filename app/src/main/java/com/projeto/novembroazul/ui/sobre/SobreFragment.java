package com.projeto.novembroazul.ui.sobre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.projeto.novembroazul.databinding.FragmentSobreBinding;

public class SobreFragment extends Fragment {

    private FragmentSobreBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SobreViewModel sobreViewModel =
                new ViewModelProvider(this).get(SobreViewModel.class);

        binding = FragmentSobreBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSobre;
        sobreViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}