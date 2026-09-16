package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؚؖؐٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0789 extends BaseAdapter {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f2839;

    /* JADX INFO: renamed from: ۥُ */
    public final LayoutInflater f2840;

    /* JADX INFO: renamed from: ۥّ */
    public final int f2841;

    /* JADX INFO: renamed from: ۥۗ */
    public int f2842 = -1;

    /* JADX INFO: renamed from: ۥۣ */
    public final MenuC4903 f2843;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f2844;

    public C0789(MenuC4903 menuC4903, LayoutInflater layoutInflater, boolean z, int i) {
        this.f2844 = z;
        this.f2840 = layoutInflater;
        this.f2843 = menuC4903;
        this.f2841 = i;
        m1692();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM8306;
        boolean z = this.f2844;
        MenuC4903 menuC4903 = this.f2843;
        if (z) {
            menuC4903.m8308();
            arrayListM8306 = menuC4903.f16186;
        } else {
            arrayListM8306 = menuC4903.m8306();
        }
        return this.f2842 < 0 ? arrayListM8306.size() : arrayListM8306.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f2840.inflate(this.f2841, viewGroup, false);
        }
        int i2 = getItem(i).f3821;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f3821 : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2843.mo7308() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC3902 interfaceC3902 = (InterfaceC3902) view;
        if (this.f2839) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC3902.mo3(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m1692();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: ۥۗ, reason: merged with bridge method [inline-methods] */
    public final C1092 getItem(int i) {
        ArrayList arrayListM8306;
        boolean z = this.f2844;
        MenuC4903 menuC4903 = this.f2843;
        if (z) {
            menuC4903.m8308();
            arrayListM8306 = menuC4903.f16186;
        } else {
            arrayListM8306 = menuC4903.m8306();
        }
        int i2 = this.f2842;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1092) arrayListM8306.get(i);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1692() {
        MenuC4903 menuC4903 = this.f2843;
        C1092 c1092 = menuC4903.f16193;
        if (c1092 != null) {
            menuC4903.m8308();
            ArrayList arrayList = menuC4903.f16186;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1092) arrayList.get(i)) == c1092) {
                    this.f2842 = i;
                    return;
                }
            }
        }
        this.f2842 = -1;
    }
}
