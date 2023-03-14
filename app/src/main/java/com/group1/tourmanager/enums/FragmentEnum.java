package com.group1.tourmanager.enums;

/**
 * Enum lưu giá trị fragment hiện tại
 * HOME: Trang chủ
 * SEARCH: Tìm kiếm
 * SCHEDULE: Lịch trình của bản thân
 * USER: Thông tin người dùng
 * SETTINGS: Các thiết lập
 */
public enum  FragmentEnum {
    HOME_FRAGMENT(1),
    SEARCH_FRAGMENT(2),
    SCHEDULE_FRAGMENT(3),
    USER_FRAGMENT(4),
    SETTINGS_FRAGMENT(5);

    private final int currentFragment;

    // Hàm tạo private - nnhiep 11.03.2023
    private FragmentEnum(int i) {
        currentFragment = i;
    }

    // Hàm lấy ra giá trị fragment hiện tại - nnhiep 11.03.2023
    public int getValue() {
        return currentFragment;
    }
}


