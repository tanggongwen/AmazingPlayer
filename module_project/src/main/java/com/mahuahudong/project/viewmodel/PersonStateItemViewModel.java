package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.R;
import com.mahuahudong.res.StringUtils;
import com.mahuahudong.res.beans.MyTrendReqBean;
import com.mahuahudong.res.beans.MyTrendsBean;
import com.mahuahudong.res.constants.RouterParames;

public class PersonStateItemViewModel extends ItemViewModel<PersonInfoViewModel> {
    private MyTrendsBean.ListBean.RowsBean rowsBean;
    public PersonStateItemViewModel(@NonNull PersonInfoViewModel viewModel, MyTrendsBean.ListBean.RowsBean rowsBean) {
        super(viewModel);
        this.rowsBean = rowsBean;
        contentOb.set(rowsBean.getContent());
        if (!StringUtils.isEmpty(rowsBean.getAvatar())){
            headUrlOb.set(rowsBean.getAvatar());
        }
        nameOb.set(rowsBean.getName());
        timeOb.set(rowsBean.getCreated_at());
        commentCountOb.set(rowsBean.getComments());
        likeCountOb.set(rowsBean.getThumps());
        if (rowsBean.getIs_thump()==1){
            likeBgOb.set(R.drawable.ic_thumb_up_48px);
        }else {
            likeBgOb.set(R.drawable.ic_thumb_up_white_48px);
        }
    }

    public BindingCommand openTrendCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_TRENDS).withSerializable(RouterParames.KEY_COMMENT,rowsBean).navigation();
        }
    });

    public BindingCommand likeCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            viewModel.thumb(rowsBean.getId());
            if (rowsBean.getIs_thump()==1){
                rowsBean.setIs_thump(0);
                likeBgOb.set(R.drawable.ic_thumb_up_white_48px);
                likeCountOb.set(Integer.parseInt(likeCountOb.get())-1+"");
            }else {
                rowsBean.setIs_thump(1);
                likeBgOb.set(R.drawable.ic_thumb_up_48px);
                likeCountOb.set(Integer.parseInt(likeCountOb.get())+1+"");
            }
        }
    });

    public ObservableField<String> contentOb = new ObservableField<>();

    public ObservableField<String> nameOb = new ObservableField<>();

    public ObservableField<String> commentCountOb = new ObservableField<>();

    public ObservableField<String> likeCountOb = new ObservableField<>();

    public ObservableField<String> headUrlOb = new ObservableField<>();

    public ObservableField<String> timeOb = new ObservableField<>();

    public ObservableInt likeBgOb = new ObservableInt(R.drawable.ic_thumb_up_48px);


    public ObservableInt headPlaceHolder = new ObservableInt(R.drawable.ic_person_48px);
}
