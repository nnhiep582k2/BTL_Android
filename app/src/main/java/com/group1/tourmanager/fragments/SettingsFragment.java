package com.group1.tourmanager.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.group1.tourmanager.R;

/**
 * Các phần tử cần có trong Settings
 * - Ngôn ngữ
 * - Hướng dẫn sử dụng: list giải thích các chức năng theo đề mục
 * - Hỏi đáp FAQ - List ra một vài câu hỏi cho người dùng
 * - Điều khoảna và chính sách bảo mật - Cop ở đâu đó cho hợp lý
 * - Đội ngũ phát triển: liệt kê thành viên trong nhóm
 * - Liên hệ - gmail: group1_android@gmail.com
 * - Phiên bản app: version_1.0.0
 */

public class SettingsFragment extends Fragment {
    public SettingsFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }
}