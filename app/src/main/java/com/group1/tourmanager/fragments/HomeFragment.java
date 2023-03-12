package com.group1.tourmanager.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.group1.tourmanager.R;

/**
 * Các phần tử cần có trong Home
 * - Tour gần bạn: lấy danh sách lịch trình theo vị trí cách ?km
 * - Đề xuất: lấy danh sách theo vị trí gần và yêu thích
 * - Tour mới: lấy danh sách orderby created date
 * - Tour hot: lấy danh sách orderby quantityOfBooking
 */

public class HomeFragment extends Fragment {
    public HomeFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}