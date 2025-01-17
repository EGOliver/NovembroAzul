package com.projeto.novembroazul.ui.mitoverdade;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MitoVerdadeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MitoVerdadeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Mitos x Verdade");
    }

    public LiveData<String> getText() {
        return mText;
    }
}