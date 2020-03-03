package com.mahuahudong.mvvm.binding.viewadapter.recyclerview;

import androidx.core.view.ViewCompat;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.res.weiget.LineManagers;

import java.util.concurrent.TimeUnit;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;

/**
 * Created by goldze on 2017/6/16.
 */
public class ViewAdapter {

    @BindingAdapter("lineManager")
    public static void setLineManager(RecyclerView recyclerView, LineManagers.LineManagerFactory lineManagerFactory) {
        recyclerView.addItemDecoration(lineManagerFactory.create(recyclerView));
    }


    @BindingAdapter(value = {"onScrollChangeCommand", "onScrollStateChangedCommand"}, requireAll = false)
    public static void onScrollChangeCommand(final RecyclerView recyclerView,
                                             final BindingCommand<ScrollDataWrapper> onScrollChangeCommand,
                                             final BindingCommand<Integer> onScrollStateChangedCommand) {
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            private int state;

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (onScrollChangeCommand != null) {
                    onScrollChangeCommand.execute(new ScrollDataWrapper(dx, dy, state));
                }
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                state = newState;
                if (onScrollStateChangedCommand != null) {
                    onScrollStateChangedCommand.execute(newState);
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    @BindingAdapter({"onLoadMoreCommand"})
    public static void onLoadMoreCommand(final RecyclerView recyclerView, final BindingCommand<Integer> onLoadMoreCommand) {
        RecyclerView.OnScrollListener listener = new OnScrollListener(onLoadMoreCommand);
        recyclerView.addOnScrollListener(listener);

    }

    @BindingAdapter("itemAnimator")
    public static void setItemAnimator(RecyclerView recyclerView, RecyclerView.ItemAnimator animator) {
        recyclerView.setItemAnimator(animator);
    }

    public static class OnScrollListener extends RecyclerView.OnScrollListener {

        private PublishSubject<Integer> methodInvoke = PublishSubject.create();

        private BindingCommand<Integer> onLoadMoreCommand;

        public OnScrollListener(final BindingCommand<Integer> onLoadMoreCommand) {
            this.onLoadMoreCommand = onLoadMoreCommand;
            methodInvoke.throttleFirst(1, TimeUnit.SECONDS)
                    .subscribe(new Consumer<Integer>() {
                        @Override
                        public void accept(Integer integer) throws Exception {
                            onLoadMoreCommand.execute(integer);
                        }
                    });
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {

        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                if (!ViewCompat.canScrollVertically(recyclerView, 1)) {
                    if (onLoadMoreCommand != null) {
                        methodInvoke.onNext(recyclerView.getAdapter().getItemCount());
                    }
                }
            }

        }



    }

    public static class ScrollDataWrapper {
        public float scrollX;
        public float scrollY;
        public int state;

        public ScrollDataWrapper(float scrollX, float scrollY, int state) {
            this.scrollX = scrollX;
            this.scrollY = scrollY;
            this.state = state;
        }
    }
}
