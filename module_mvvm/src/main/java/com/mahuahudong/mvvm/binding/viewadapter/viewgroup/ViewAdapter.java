package com.mahuahudong.mvvm.binding.viewadapter.viewgroup;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

/**
 * Created by goldze on 2017/6/18.
 */
public final class ViewAdapter {

    @BindingAdapter({"itemView", "observableList"})
    public static void addViews(ViewGroup viewGroup, final ItemBinding itemBinding, final ObservableList<IBindingItemViewModel> viewModelList) {
        if (viewModelList != null && !viewModelList.isEmpty()) {
            viewGroup.removeAllViews();
            for (IBindingItemViewModel viewModel : viewModelList) {
                ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                        itemBinding.layoutRes(), viewGroup, true);
                binding.setVariable(itemBinding.variableId(), viewModel);
                viewModel.injecDataBinding(binding);
            }
        }
    }

    @BindingAdapter(value = {"customWidth","customHeight"},requireAll = false)
    public static void setCustomLayoutParams(ViewGroup viewGroup,int customWidth,int customHeight){
        if (0!=customWidth){
            viewGroup.getLayoutParams().width = customWidth;
        }
        if (0!=customHeight){
            viewGroup.getLayoutParams().height = customHeight;
        }
    }

    @BindingAdapter(value = {"backgroundRes"})
    public static void setBackgroudRes(ViewGroup viewGroup,int backgroundRes){
        viewGroup.setBackgroundResource(backgroundRes);
    }


}

