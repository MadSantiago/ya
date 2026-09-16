package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000.C1092;
import p000.C5460;
import p000.InterfaceC1580;
import p000.InterfaceC2122;
import p000.MenuC4903;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1580, InterfaceC2122, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final int[] f13 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: ۦۨ */
    public MenuC4903 f14;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C5460 c5460M9119 = C5460.m9119(context, attributeSet, f13, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c5460M9119.f17999;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c5460M9119.m9123(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c5460M9119.m9123(1));
        }
        c5460M9119.m9126();
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo6((C1092) getAdapter().getItem(i));
    }

    @Override // p000.InterfaceC2122
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo5(MenuC4903 menuC4903) {
        this.f14 = menuC4903;
    }

    @Override // p000.InterfaceC1580
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo6(C1092 c1092) {
        return this.f14.m8299(c1092, null, 0);
    }
}
