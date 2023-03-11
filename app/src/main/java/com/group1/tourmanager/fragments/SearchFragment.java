package com.group1.tourmanager.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.group1.tourmanager.R;

/**
 * Các phần tử cần có trong Search
 * - Tìm kiếm theo nhà cung cấp
 * - Tìm kiếm theo vị trí
 * - Tìm kiếm theo năm
 * - Tìm kiếm theo giá
 * - Sắp xếp
 * - Cho vào danh sách yêu thích - danh sách hiển thị một nút yêu thích
 */

public class SearchFragment extends Fragment {
    public SearchFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search, container, false);
    }
}