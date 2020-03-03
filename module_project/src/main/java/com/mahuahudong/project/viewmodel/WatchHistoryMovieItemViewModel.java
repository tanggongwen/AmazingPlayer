package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;

import com.mahuahudong.mvvm.base.ItemViewModel;

public class WatchHistoryMovieItemViewModel extends ItemViewModel<WatchHistoryListViewModel> {
    public WatchHistoryMovieItemViewModel(@NonNull WatchHistoryListViewModel viewModel) {
        super(viewModel);
    }
}
