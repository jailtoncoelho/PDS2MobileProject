package com.pds2mobileproject.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Olá, eu sou o app da turma de PDS2. Espero que todos me ajudem a evoluir.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}