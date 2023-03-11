package com.group1.tourmanager.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.group1.tourmanager.R;

/**
 * Các phần tử cần có trong Schedule
 * - Lọc lịch trình ở trên: lọc theo một số tiêu chí
 * - Phân trang: như trong web
 * - Danh sách lịch trình: hiển thị danh sách lịch trình của người dùng
 */

public class ScheduleFragment extends Fragment {
    public ScheduleFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schedule, container, false);
    }
}