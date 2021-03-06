package liuxi.faner.view;

import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import liuxi.faner.CashierInputFilter;
import liuxi.faner.R;
import liuxi.faner.bean.ItemPriceData;

/**
 * Created by david on 17-5-16.
 */

public class AddPersonChildView extends LinearLayout {

    private View mRootView;
    private ItemPriceData mData;

    public AddPersonChildView(Context context, ItemPriceData data) {
        super(context);
        setOrientation(LinearLayout.HORIZONTAL);
        mData = data;
        mRootView = LayoutInflater.from(context).inflate(R.layout.item_edit_type, null);
        LayoutParams lp = new LayoutParams(-1, -2);
        addView(mRootView, lp);
        ((TextView) mRootView.findViewById(R.id.item_name)).setText(String.valueOf(mData.getItemName()));
        EditText editText = (EditText) mRootView.findViewById(R.id.pay_price);
        InputFilter[] filters = {new CashierInputFilter()};
        editText.setFilters(filters);
    }

    public ItemPriceData getPrice() {
        EditText editText = (EditText) mRootView.findViewById(R.id.pay_price);
        mData.setItemPrice(Double.parseDouble(editText.getText().toString().trim()));
        return mData;
    }

}
