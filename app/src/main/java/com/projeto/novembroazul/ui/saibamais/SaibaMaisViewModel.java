package com.projeto.novembroazul.ui.saibamais;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SaibaMaisViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SaibaMaisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Links e Recursos Externos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}