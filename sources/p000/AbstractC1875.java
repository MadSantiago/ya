package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: ۥٝؓۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1875 implements InterfaceC0470, InterfaceC3442, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۦۨ */
    public Rect f6224;

    /* JADX INFO: renamed from: ۦٌ */
    public static int m3725(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0789) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0789) listAdapter).f2843.m8299((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC5614) ? 0 : 4);
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo3726(C1092 c1092) {
        return false;
    }

    /* JADX INFO: renamed from: ۥَ */
    public abstract void mo3727(boolean z);

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo3728(C1092 c1092) {
        return false;
    }

    /* JADX INFO: renamed from: ۥْ */
    public abstract void mo3729(int i);

    /* JADX INFO: renamed from: ۥٓ */
    public abstract void mo3730(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: ۥٖ */
    public abstract void mo3731(int i);

    /* JADX INFO: renamed from: ۦؚ */
    public abstract void mo3732(MenuC4903 menuC4903);

    /* JADX INFO: renamed from: ۦۚ */
    public abstract void mo3734(View view);

    /* JADX INFO: renamed from: ۦ۟ */
    public abstract void mo3735(int i);

    /* JADX INFO: renamed from: ۦۨ */
    public abstract void mo3736(boolean z);

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo3733(Context context, MenuC4903 menuC4903) {
    }
}
