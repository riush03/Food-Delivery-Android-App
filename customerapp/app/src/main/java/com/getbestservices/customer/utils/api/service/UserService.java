package com.getbestservices.customer.utils.api.service;

import com.getbestservices.customer.json.AllMerchantByNearResponseJson;
import com.getbestservices.customer.json.AllMerchantbyCatRequestJson;
import com.getbestservices.customer.json.AllTransResponseJson;
import com.getbestservices.customer.json.BankResponseJson;
import com.getbestservices.customer.json.BeritaDetailRequestJson;
import com.getbestservices.customer.json.BeritaDetailResponseJson;
import com.getbestservices.customer.json.ChangePassRequestJson;
import com.getbestservices.customer.json.DetailRequestJson;
import com.getbestservices.customer.json.EditprofileRequestJson;
import com.getbestservices.customer.json.GetAllMerchantbyCatRequestJson;
import com.getbestservices.customer.json.GetFiturResponseJson;
import com.getbestservices.customer.json.GetHomeRequestJson;
import com.getbestservices.customer.json.GetHomeResponseJson;
import com.getbestservices.customer.json.GetMerchantbyCatRequestJson;
import com.getbestservices.customer.json.LoginRequestJson;
import com.getbestservices.customer.json.LoginResponseJson;
import com.getbestservices.customer.json.MerchantByCatResponseJson;
import com.getbestservices.customer.json.MerchantByIdResponseJson;
import com.getbestservices.customer.json.MerchantByNearResponseJson;
import com.getbestservices.customer.json.MerchantbyIdRequestJson;
import com.getbestservices.customer.json.PrivacyRequestJson;
import com.getbestservices.customer.json.PrivacyResponseJson;
import com.getbestservices.customer.json.PromoRequestJson;
import com.getbestservices.customer.json.PromoResponseJson;
import com.getbestservices.customer.json.RateRequestJson;
import com.getbestservices.customer.json.RateResponseJson;
import com.getbestservices.customer.json.RegisterRequestJson;
import com.getbestservices.customer.json.RegisterResponseJson;
import com.getbestservices.customer.json.ResponseJson;
import com.getbestservices.customer.json.SearchMerchantbyCatRequestJson;
import com.getbestservices.customer.json.TopupRequestJson;
import com.getbestservices.customer.json.TopupResponseJson;
import com.getbestservices.customer.json.WalletRequestJson;
import com.getbestservices.customer.json.WalletResponseJson;
import com.getbestservices.customer.json.WithdrawRequestJson;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/13/2019.
 */

public interface UserService {

    @POST("pelanggan/login")
    Call<LoginResponseJson> login(@Body LoginRequestJson param);

    @POST("pelanggan/kodepromo")
    Call<PromoResponseJson> promocode(@Body PromoRequestJson param);

    @POST("pelanggan/listkodepromo")
    Call<PromoResponseJson> listpromocode(@Body PromoRequestJson param);

    @POST("pelanggan/list_bank")
    Call<BankResponseJson> listbank(@Body WithdrawRequestJson param);

    @POST("pelanggan/changepass")
    Call<LoginResponseJson> changepass(@Body ChangePassRequestJson param);

    @POST("pelanggan/register_user")
    Call<RegisterResponseJson> register(@Body RegisterRequestJson param);

    @GET("pelanggan/detail_fitur")
    Call<GetFiturResponseJson> getFitur();

    @POST("pelanggan/forgot")
    Call<LoginResponseJson> forgot(@Body LoginRequestJson param);

    @POST("pelanggan/privacy")
    Call<PrivacyResponseJson> privacy(@Body PrivacyRequestJson param);

    @POST("pelanggan/home")
    Call<GetHomeResponseJson> home(@Body GetHomeRequestJson param);

    @POST("pelanggan/topupstripe")
    Call<TopupResponseJson> topup(@Body TopupRequestJson param);

    @POST("pelanggan/withdraw")
    Call<ResponseJson> withdraw(@Body WithdrawRequestJson param);

    @POST("pelanggan/topuppaypal")
    Call<ResponseJson> topuppaypal(@Body WithdrawRequestJson param);

    @POST("pelanggan/rate_driver")
    Call<RateResponseJson> rateDriver(@Body RateRequestJson param);

    @POST("pelanggan/edit_profile")
    Call<RegisterResponseJson> editProfile(@Body EditprofileRequestJson param);

    @POST("pelanggan/wallet")
    Call<WalletResponseJson> wallet(@Body WalletRequestJson param);

    @POST("pelanggan/history_progress")
    Call<AllTransResponseJson> history(@Body DetailRequestJson param);

    @POST("pelanggan/detail_berita")
    Call<BeritaDetailResponseJson> beritadetail(@Body BeritaDetailRequestJson param);

    @POST("pelanggan/all_berita")
    Call<BeritaDetailResponseJson> allberita(@Body BeritaDetailRequestJson param);

    @POST("pelanggan/merchantbykategoripromo")
    Call<MerchantByCatResponseJson> getmerchanbycat(@Body GetMerchantbyCatRequestJson param);

    @POST("pelanggan/merchantbykategori")
    Call<MerchantByNearResponseJson> getmerchanbynear(@Body GetMerchantbyCatRequestJson param);

    @POST("pelanggan/allmerchantbykategori")
    Call<AllMerchantByNearResponseJson> getallmerchanbynear(@Body GetAllMerchantbyCatRequestJson param);

    @POST("pelanggan/itembykategori")
    Call<MerchantByIdResponseJson> getitembycat(@Body GetAllMerchantbyCatRequestJson param);

    @POST("pelanggan/searchmerchant")
    Call<AllMerchantByNearResponseJson> searchmerchant(@Body SearchMerchantbyCatRequestJson param);

    @POST("pelanggan/allmerchant")
    Call<AllMerchantByNearResponseJson> allmerchant(@Body AllMerchantbyCatRequestJson param);

    @POST("pelanggan/merchantbyid")
    Call<MerchantByIdResponseJson> merchantbyid(@Body MerchantbyIdRequestJson param);


}
