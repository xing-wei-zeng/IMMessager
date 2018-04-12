package net.zxw.italker.common.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import net.zxw.italker.common.R;
import net.zxw.italker.common.widget.recycler.RecyclerAdapter;

/**
 * @author zxw
 * @Email 18316275391@163.com
 * @describe 自定义控件
 */

public class GalleyView extends RecyclerView {
    private Adapter mAdapter = new Adapter();

    public GalleyView(Context context) {
        super(context);
    }

    public GalleyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GalleyView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    private void init(){
        setLayoutManager(new GridLayoutManager(getContext(),4));
        setAdapter(mAdapter);
        mAdapter.setListener(new RecyclerAdapter.AdapterListener<Image>() {
            @Override
            public void onItemClick(RecyclerAdapter.ViewHolder holder, Image image) {

            }

            @Override
            public void onItemLongClick(RecyclerAdapter.ViewHolder holder, Image image) {

            }
        });
    }

    private static class Image {

    }

    private class Adapter extends RecyclerAdapter<Image>{

        @Override
        public void update(Image image, ViewHolder<Image> holder) {

        }

        @Override
        protected int getItemViewType(int position, Image image) {
            return R.layout.cell_galley;
        }

        @Override
        protected ViewHolder<Image> onCreateViewHolder(View root, int viewType) {
            return new GalleyView.ViewHolder(root);
        }
    }
    private class ViewHolder extends RecyclerAdapter.ViewHolder<Image>{

        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void onBind(Image image) {

        }
    }
}
