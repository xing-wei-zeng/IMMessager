package net.zxw.italker.common.widget.recycler;

/**
 * @author zxw
 * @Email 18316275391@163.com
 * @describe 更新回调
 */


public interface AdapterCallback<Data> {
    void update(Data data, RecyclerAdapter.ViewHolder<Data> holder);
}
