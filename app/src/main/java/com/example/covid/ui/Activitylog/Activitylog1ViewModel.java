package com.example.covid.ui.Activitylog;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Activitylog1ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Activitylog1ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(" ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}