package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.project.R;

public class WatchHistoryItemViewModel extends ItemViewModel<MineFrgViewModel> {
    public WatchHistoryItemViewModel(@NonNull MineFrgViewModel viewModel) {
        super(viewModel);
    }

    public ObservableField<String> coverUrlOb = new ObservableField<>("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1583422800440&di=2dd71882312b3e959510a4be4a97ad50&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2Fd4408991b088a2f7ac466d9253d7a654c6a69c07d3af-x7dJ92_fw658");


    public ObservableInt coverPlaceHolder = new ObservableInt(R.color.white);

    public ObservableField<String> dateOb = new ObservableField<>();


    public ObservableField<String> introOb = new ObservableField<>();
}
