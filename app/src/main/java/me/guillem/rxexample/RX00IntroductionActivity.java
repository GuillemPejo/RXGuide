package me.guillem.rxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RX00IntroductionActivity extends AppCompatActivity {

    private String TAG = "RX00";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx00_intro);

        Observable<String> numbersObservable =
                Observable.just("1","2","3","4","5","6","7","8","9","10");

        Observer<String> numbersObserver = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "onSubscribe" + " Thread: " + Thread.currentThread().getName());
            }

            @Override
            public void onNext(String numero) {
                Log.d(TAG, "onNext: Number: "+ numero + " Thread: " + Thread.currentThread().getName());
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError" + " Thread: " + Thread.currentThread().getName());
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: All data has been emitted" + " Thread: " + Thread.currentThread().getName());
            }
        };

        numbersObservable
                .subscribeOn(Schedulers.io())
                .subscribe(numbersObserver);
    }
}


