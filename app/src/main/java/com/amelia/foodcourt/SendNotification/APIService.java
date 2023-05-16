package com.amelia.foodcourt.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAArSlUdWc:APA91bEqsQAdTIyb_XZc_UuJzUoJDOuN5lADvxdyGMmWsYv40gYSF7bc1UYwY_gEgZXe-QQ_v1TwQMKoMnwfbMX1LHCHIEl1Siuq8YviP-Mc6pXwjFLE3Ao_frKhyvLxA_LKhMQdinzf"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
