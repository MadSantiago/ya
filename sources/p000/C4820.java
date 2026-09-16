package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: ۦؘٞؗٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4820 extends C1391 {

    /* JADX INFO: renamed from: ۥؓ */
    public final int f15881;

    /* JADX INFO: renamed from: ۥً */
    public InterfaceC3864 f15882;

    /* JADX INFO: renamed from: ۥۧ */
    public final int f15883;

    /* JADX INFO: renamed from: ۦٚ */
    public C1092 f15884;

    public C4820(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f15881 = 21;
            this.f15883 = 22;
        } else {
            this.f15881 = 22;
            this.f15883 = 21;
        }
    }

    @Override // p000.C1391, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0789 c0789;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f15882 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0789 = (C0789) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0789 = (C0789) adapter;
                headersCount = 0;
            }
            C1092 c1092M1691 = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0789.getCount()) ? null : c0789.getItem(i);
            C1092 c1092 = this.f15884;
            if (c1092 != c1092M1691) {
                MenuC4903 menuC4903 = c0789.f2843;
                if (c1092 != null) {
                    this.f15882.mo6897(menuC4903, c1092);
                }
                this.f15884 = c1092M1691;
                if (c1092M1691 != null) {
                    this.f15882.mo6898(menuC4903, c1092M1691);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f15881) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f15883) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0789) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0789) adapter).f2843.m8297(false);
        return true;
    }

    public void setHoverListener(InterfaceC3864 interfaceC3864) {
        this.f15882 = interfaceC3864;
    }

    @Override // p000.C1391, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
