package com.example.rxjavaoct14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="Umang" ;
    Button mBtnJustButton, mBtnFromArrayButton, mBtnRangeButton, mBtnStudentSorting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnFromArrayButton = findViewById(R.id.btnFromArray);
        mBtnJustButton = findViewById(R.id.btnJustButton);
        mBtnRangeButton = findViewById(R.id.btnRangeButton);
        mBtnStudentSorting = findViewById(R.id.btnStudentSorting);

        justButtonClicked();
        fromArrayButtonClicked();
        rangeButtonClicked();
        sortStudentByNameLength();
    }

    private void justButtonClicked() {
        mBtnJustButton.setOnClickListener(view -> {
            String name = "Umang";
            Observable<String> stringObservable = Observable.just(name);
            Observer<String> stringObserver = new Observer<String>() {
                @Override
                public void onSubscribe(@NonNull Disposable d) {
                    Log.d(TAG, "onSubscribe");
                }

                @Override
                public void onNext(@NonNull String s) {
                    Log.d(TAG, "onNext Name is : - " + s);
                }

                @Override
                public void onError(@NonNull Throwable e) {
                    Log.d(TAG, "onError");
                }

                @Override
                public void onComplete() {
                    Log.d(TAG, "onComplete: Task Completed");
                }
            };
            stringObservable.subscribe(stringObserver);
        });
    }

    private void fromArrayButtonClicked() {
        mBtnFromArrayButton.setOnClickListener(view->{
            String[]arr={"a","b","c","d"};
            Observable<String> observableSt= Observable.fromArray(arr);
            Observer<String> observerSt=new Observer<String>(){

                @Override
                public void onSubscribe(@NonNull Disposable d) {
                    Log.d(TAG, "onSubscribe");
                }

                @Override
                public void onNext(@NonNull String s) {
                    Log.d(TAG, s);
                }

                @Override
                public void onError(@NonNull Throwable e) {
                    Log.d(TAG, "onError");
                }

                @Override
                public void onComplete() {
                    Log.d(TAG, "onComplete");
                }
            };
            observableSt.subscribe(observerSt);

        });


    }

    private void rangeButtonClicked() {

        mBtnRangeButton.setOnClickListener(view -> {

            Observable<Integer> observablein = Observable.range(20, 20);
            Observer<Integer> observerin1 = new Observer<Integer>() {
                @Override
                public void onSubscribe(@NonNull Disposable d) {
                    Log.d(TAG, "onSubscribe");
                }

                @Override
                public void onNext(@NonNull Integer integer) {
                    Log.d(TAG, integer.toString());
                }

                @Override
                public void onError(@NonNull Throwable e) {
                    Log.d(TAG, "onError");
                }

                @Override
                public void onComplete() {
                    Log.d(TAG, "onComplete");
                }
            };
            observablein.subscribe(observerin1);

        });
    }

    private void sortStudentByNameLength(){
        Log.d(TAG,"not implemented");
    }






}