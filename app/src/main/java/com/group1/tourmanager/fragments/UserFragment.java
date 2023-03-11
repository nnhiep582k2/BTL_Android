package com.group1.tourmanager.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.group1.tourmanager.R;

/**
 * Các phần tử cần có trong User
 * - Thông tin như: avatar, tên, số điện thoại: hiển thị sao cho hợp lý
 * - Tour yêu thích: lấy danh sách tour yêu thích
 * - Thông báo: hiển thị các thông báo
 * - Đổi thông tin: hiển thị activity hoặc popup cho sửa thông tin người dùng
 * - Đăng xuất: đưa về activity Login
 */

public class UserFragment extends Fragment {
    public UserFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user, container, false);
    }
}