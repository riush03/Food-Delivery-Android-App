package com.getbestservices.customer.utils.api.service;

import com.getbestservices.customer.json.CheckStatusTransaksiRequest;
import com.getbestservices.customer.json.CheckStatusTransaksiResponse;
import com.getbestservices.customer.json.DetailRequestJson;
import com.getbestservices.customer.json.DetailTransResponseJson;
import com.getbestservices.customer.json.GetNearRideCarRequestJson;
import com.getbestservices.customer.json.GetNearRideCarResponseJson;
import com.getbestservices.customer.json.ItemRequestJson;
import com.getbestservices.customer.json.LokasiDriverRequest;
import com.getbestservices.customer.json.LokasiDriverResponse;
import com.getbestservices.customer.json.RideCarRequestJson;
import com.getbestservices.customer.json.RideCarResponseJson;
import com.getbestservices.customer.json.SendRequestJson;
import com.getbestservices.customer.json.SendResponseJson;
import com.getbestservices.customer.json.fcm.CancelBookRequestJson;
import com.getbestservices.customer.json.fcm.CancelBookResponseJson;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/17/2019.
 */

public interface BookService {

    @POST("pelanggan/list_ride")
    Call<GetNearRideCarResponseJson> getNearRide(@Body GetNearRideCarRequestJson param);

    @POST("pelanggan/list_car")
    Call<GetNearRideCarResponseJson> getNearCar(@Body GetNearRideCarRequestJson param);

    @POST("pelanggan/request_transaksi")
    Call<RideCarResponseJson> requestTransaksi(@Body RideCarRequestJson param);

    @POST("pelanggan/inserttransaksimerchant")
    Call<RideCarResponseJson> requestTransaksiMerchant(@Body ItemRequestJson param);

    @POST("pelanggan/request_transaksi_send")
    Call<SendResponseJson> requestTransaksisend(@Body SendRequestJson param);

    @POST("pelanggan/check_status_transaksi")
    Call<CheckStatusTransaksiResponse> checkStatusTransaksi(@Body CheckStatusTransaksiRequest param);

    @POST("pelanggan/user_cancel")
    Call<CancelBookResponseJson> cancelOrder(@Body CancelBookRequestJson param);

    @POST("pelanggan/liat_lokasi_driver")
    Call<LokasiDriverResponse> liatLokasiDriver(@Body LokasiDriverRequest param);

    @POST("pelanggan/detail_transaksi")
    Call<DetailTransResponseJson> detailtrans(@Body DetailRequestJson param);


}
