package com.projeto.novembroazul.ui.chamadaacao;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChamadaAcaoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ChamadaAcaoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Chamada para Ação");
    }

    public LiveData<String> getText() {
        return mText;
    }
}