package com.group1.tourmanager.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.group1.tourmanager.R;
import com.group1.tourmanager.enums.FragmentEnum;
import com.group1.tourmanager.fragments.HomeFragment;
import com.group1.tourmanager.fragments.ScheduleFragment;
import com.group1.tourmanager.fragments.SearchFragment;
import com.group1.tourmanager.fragments.SettingsFragment;
import com.group1.tourmanager.fragments.UserFragment;

public class MainActivity extends AppCompatActivity {
    // region Biến
    boolean loginState;
    MeowBottomNavigation navBottom;
    // endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Nhận dữ liệu trả về từ intent màn Login - nnhiep 11.03.2023
        Intent intent = getIntent();
        if (intent.getBooleanExtra("LoginState", loginState)) {
            Toast.makeText(MainActivity.this, this.getResources().getString(R.string.login_success), Toast.LENGTH_SHORT).show();
        }

        // Gán giá trị cho navigation - nnhiep 11.03.2023
        navBottom = (MeowBottomNavigation) findViewById(R.id.navBottom);

        // Thêm các phần tử vào navigation - nnhiep 11.03.2023
        navBottom.add(new MeowBottomNavigation.Model(1, R.drawable.ic_baseline_home_24));
        navBottom.add(new MeowBottomNavigation.Model(2, R.drawable.ic_baseline_search_24));
        navBottom.add(new MeowBottomNavigation.Model(3, R.drawable.ic_baseline_calendar_today_24));
        navBottom.add(new MeowBottomNavigation.Model(4, R.drawable.ic_baseline_second_person_24));
        navBottom.add(new MeowBottomNavigation.Model(5, R.drawable.ic_baseline_settings_24));

        // Lắng nghe sự kiện hiển thị từng phần tử - nnhiep 11.03.2023
        navBottom.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment;
                if (item.getId() == FragmentEnum.SETTINGS_FRAGMENT.getValue()) {
                    fragment = new SettingsFragment();
                } else if (item.getId() == FragmentEnum.USER_FRAGMENT.getValue()) {
                    fragment = new UserFragment();
                } else if (item.getId() == FragmentEnum.SCHEDULE_FRAGMENT.getValue()) {
                    fragment = new ScheduleFragment();
                } else if (item.getId() == FragmentEnum.SEARCH_FRAGMENT.getValue()) {
                    fragment = new SearchFragment();
                } else {
                    fragment = new HomeFragment();
                }

                // Load để hiển thị fragment đang được chọn
                loadFragment(fragment);
            }
        });

        // Đặt giá trị mặc định cho fragment để hiển thị - nnhiep 11.03.2023
        navBottom.show(1, true);

        // Lắng nghe sự kiện click chuyển fragment - nnhiep 11.03.2023
        navBottom.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(), "You clicked " + item.getId(), Toast.LENGTH_SHORT).show();
            }
        });

        // Lắng nghe sự kiện chọn lại - nnhiep 11.03.2023
        navBottom.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(), "You reselected " + item.getId(), Toast.LENGTH_SHORT).show();
            }
        });

        // Thiết lập số 3 cho tab User - nnhiep 11.03.2023
        navBottom.setCount(4, "10");
    }

    /**
     * Hàm load fragment lên màn hình
     * @param fragment - fragment muốn hiển thị
     * @author nnhiep 11.03.2023
     */
    private void loadFragment(Fragment fragment) {
        // Thay đổi fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.fragContainer, fragment, null).commit();
    }
}