package com.getbestservices.customer.fragment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


import com.getbestservices.customer.R;
import com.getbestservices.customer.constants.BaseApp;
import com.getbestservices.customer.item.FavouriteItem;
import com.getbestservices.customer.models.FavouriteModel;
import com.getbestservices.customer.models.User;
import com.getbestservices.customer.utils.DatabaseHelper;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class FavouriteFragment extends Fragment {


    private Context context;
    private ArrayList<FavouriteModel> listItem;
    private RecyclerView recyclerView;
    private DatabaseHelper databaseHelper;
    private RelativeLayout notFound;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.fragment_recycle, container, false);
        context = getContext();
        listItem = new ArrayList<>();
        databaseHelper = new DatabaseHelper(getActivity());
        notFound = getView.findViewById(R.id.rlnodata);
        recyclerView = getView.findViewById(R.id.inboxlist);

        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));


        return getView;
    }

    @Override
    public void onResume() {
        super.onResume();
        User loginUser = BaseApp.getInstance(context).getLoginUser();
        if (databaseHelper.getFavouriteByMyid(loginUser.getId())) {
            listItem = databaseHelper.getFavourite();
        }
        displayData();
    }

    private void displayData() {
        FavouriteItem adapter = new FavouriteItem(getActivity(), listItem, R.layout.item_grid_full);
        recyclerView.setAdapter(adapter);
        if (adapter.getItemCount() == 0) {
            notFound.setVisibility(View.VISIBLE);
        } else {
            notFound.setVisibility(View.GONE);
        }

    }

}
