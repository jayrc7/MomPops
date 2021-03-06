package com.example.mom_pops.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mom_pops.MyFavorites;
import com.example.mom_pops.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        //navigate from home page to spin the wheel page
        Button spin_the_wheel_button = (Button) root.findViewById(R.id.btn_spin_the_wheel);
        spin_the_wheel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_spin_the_wheel();
            }
        });

        return root;
    }

    /**
     * Opens spin the wheel page
     */
    public void open_spin_the_wheel() {
        Intent intent = new Intent(getActivity(), MyFavorites.class);
        startActivity(intent);
    }
}