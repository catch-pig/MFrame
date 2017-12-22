package com.zhuazhu.frame.adpter;

import android.view.View;
import android.widget.TextView;

import com.zhuazhu.frame.R;
import com.zhuazhu.frame.mvp.model.User;

import butterknife.BindView;
import butterknife.ButterKnife;
import mejust.frame.annotation.Adapter;
import mejust.frame.widget.adapter.BaseViewHolder;
import mejust.frame.widget.refresh.IPageControl;
import mejust.frame.widget.adapter.RecyclerAdapter;

/**
 * 创建时间:2017/12/22 0:36<br/>
 * 创建人: 李涛<br/>
 * 修改人: 李涛<br/>
 * 修改时间: 2017/12/22 0:36<br/>
 * 描述:
 */
@Adapter(layout = R.layout.item_re,holder = ReAdapter.ViewHolder.class)
public class ReAdapter extends RecyclerAdapter<User, ReAdapter.ViewHolder> {
    public ReAdapter(IPageControl pageControl){
        super(pageControl);
    }

    @Override
    public void bindViewHolder(ViewHolder holder, User user, int position) {
        holder.mName.setText(user.getName());
    }

    static class ViewHolder extends BaseViewHolder {
        @BindView(R.id.name)
        TextView mName;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(view);
        }
    }
}