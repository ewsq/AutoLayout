package com.sir.library.auto.attr;

import android.view.View;

/**
 * Created by zhy on 15/12/5.
 */
public class PaddingTopAttr extends AutoAttr {
    public PaddingTopAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    public static PaddingTopAttr generate(int val, int baseFlag) {
        PaddingTopAttr attr = null;
        switch (baseFlag) {
            case BASE_WIDTH:
                attr = new PaddingTopAttr(val, Attrs.PADDING_TOP, 0);
                break;
            case BASE_HEIGHT:
                attr = new PaddingTopAttr(val, 0, Attrs.PADDING_TOP);
                break;
            case BASE_DEFAULT:
                attr = new PaddingTopAttr(val, 0, 0);
                break;
        }
        return attr;
    }

    @Override
    protected boolean defaultBaseWidth() {
        return false;
    }

    @Override
    protected void execute(View view, int val) {
        int l = view.getPaddingLeft();
        int t = val;
        int r = view.getPaddingRight();
        int b = view.getPaddingBottom();
        view.setPadding(l, t, r, b);
    }

    @Override
    protected int attrVal() {
        return Attrs.PADDING_TOP;
    }
}
