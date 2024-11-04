package com.projeto.novembroazul.ui.prevencoes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PrevencoesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PrevencoesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Prevenções");
    }

    public LiveData<String> getText() {
        return mText;
    }
}