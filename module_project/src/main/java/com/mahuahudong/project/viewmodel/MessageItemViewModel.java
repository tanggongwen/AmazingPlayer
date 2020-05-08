package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.res.beans.ReplyRespBean;

public class MessageItemViewModel extends ItemViewModel<TrendsViewModel> {
    public MessageItemViewModel(@NonNull TrendsViewModel viewModel, ReplyRespBean.ListBean.RowsBean rowsBean) {
        super(viewModel);
    }
}
