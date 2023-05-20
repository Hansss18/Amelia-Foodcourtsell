package com.amelia.foodcourt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    Button signinemail, signinphone, signup;
    ImageView bgimage;

//    private InterstitialAd interstitialAd;
//    //    private static final String AD_UNIT_ID = "";
//    private static final String AD_UNIT_ID = "";
//    private static final String TAG = "MainMenu";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

//        signinemail = (Button) findViewById(R.id.SignwithEmail);
//        signup = (Button) findViewById(R.id.SignUp);

        signinemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent signemail = new Intent(MainMenu.this, ChooseOne.class);
                signemail.putExtra("Home", "Email");
                startActivity(signemail);
                finish();
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(MainMenu.this, ChooseOne.class);
                signup.putExtra("Home", "SignUp");
                startActivity(signup);
                finish();
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
    }

//    public void loadAd() {
//        AdRequest adRequest = new AdRequest.Builder().build();
//        InterstitialAd.load(
//                this,
//                AD_UNIT_ID,
//                adRequest,
//                new InterstitialAdLoadCallback() {
//                    @Override
//                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
//                        // The mInterstitialAd reference will be null until
//                        // an ad is loaded.
//                        MainMenu.this.interstitialAd = interstitialAd;
//                        Log.i(TAG, "onAdLoaded");
//                        Toast.makeText(MainMenu.this, "onAdLoaded()", Toast.LENGTH_SHORT).show();
//                        interstitialAd.setFullScreenContentCallback(
//                                new FullScreenContentCallback() {
//                                    @Override
//                                    public void onAdDismissedFullScreenContent() {
//                                        // Called when fullscreen content is dismissed.
//                                        // Make sure to set your reference to null so you don't
//                                        // show it a second time.
//                                        MainMenu.this.interstitialAd = null;
//                                        Log.d("TAG", "The ad was dismissed.");
//                                    }
//
//                                    @Override
//                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
//                                        // Called when fullscreen content failed to show.
//                                        // Make sure to set your reference to null so you don't
//                                        // show it a second time.
//                                        MainMenu.this.interstitialAd = null;
//                                        Log.d("TAG", "The ad failed to show.");
//                                    }
//
//                                    @Override
//                                    public void onAdShowedFullScreenContent() {
//                                        // Called when fullscreen content is shown.
//                                        Log.d("TAG", "The ad was shown.");
//                                    }
//                                });
//                    }
//
//                    @Override
//                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
//                        // Handle the error
//                        Log.i(TAG, loadAdError.getMessage());
//                        interstitialAd = null;
//
//                        String error =
//                                String.format(
//                                        "domain: %s, code: %d, message: %s",
//                                        loadAdError.getDomain(), loadAdError.getCode(), loadAdError.getMessage());
//                        Toast.makeText(
//                                        MainMenu.this, "onAdFailedToLoad() with error: " + error, Toast.LENGTH_SHORT)
//                                .show();
//                    }
//                });
//    }
//

}


