package liuxi.faner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;


import java.util.ArrayList;
import java.util.List;

import liuxi.faner.bean.ItemPriceData;

/**
 * Created by david on 17-5-16.
 */

public class AddPersonView extends LinearLayout {

    public AddPersonView(Context context) {
        super(context);
        setOrientation(LinearLayout.VERTICAL);
    }

    public AddPersonView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AddPersonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void addChildView(ItemPriceData data) {
        AddPersonChildView childView = new AddPersonChildView(getContext(), data);
        this.addView(childView, new LayoutParams(-1, -2));
    }

    public List<ItemPriceData> getPriceList() {
        List<ItemPriceData> mData = new ArrayList<>();
        for (int i = 0; i < getChildCount(); i++) {
            ItemPriceData data = ((AddPersonChildView) getChildAt(i)).getPrice();
            mData.add(data);
        }
        return mData;
    }
}
