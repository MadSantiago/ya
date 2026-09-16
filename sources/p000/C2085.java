package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥؚۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2085 extends BaseAdapter {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C5007 f6873;

    /* JADX INFO: renamed from: ۥۣ */
    public int f6874 = -1;

    public C2085(C5007 c5007) {
        this.f6873 = c5007;
        m4026();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        MenuC4903 menuC4903 = this.f6873.f16575;
        menuC4903.m8308();
        int size = menuC4903.f16186.size();
        return this.f6874 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f6873.f16578.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC3902) view).mo3(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m4026();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: ۥۗ, reason: merged with bridge method [inline-methods] */
    public final C1092 getItem(int i) {
        MenuC4903 menuC4903 = this.f6873.f16575;
        menuC4903.m8308();
        ArrayList arrayList = menuC4903.f16186;
        int i2 = this.f6874;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1092) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4026() {
        MenuC4903 menuC4903 = this.f6873.f16575;
        C1092 c1092 = menuC4903.f16193;
        if (c1092 != null) {
            menuC4903.m8308();
            ArrayList arrayList = menuC4903.f16186;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1092) arrayList.get(i)) == c1092) {
                    this.f6874 = i;
                    return;
                }
            }
        }
        this.f6874 = -1;
    }
}
