package p000;

import android.view.Window;

/* JADX INFO: renamed from: ۦۧؔۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5822 implements InterfaceC3685, InterfaceC3370 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ LayoutInflaterFactory2C1852 f19165;

    public /* synthetic */ C5822(LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852) {
        this.f19165 = layoutInflaterFactory2C1852;
    }

    @Override // p000.InterfaceC3370
    /* JADX INFO: renamed from: ۥْ */
    public boolean mo2761(MenuC4903 menuC4903) {
        Window.Callback callback;
        if (menuC4903 != menuC4903.mo7310()) {
            return true;
        }
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f19165;
        if (!layoutInflaterFactory2C1852.f6173 || (callback = layoutInflaterFactory2C1852.f6147.getCallback()) == null || layoutInflaterFactory2C1852.f6161) {
            return true;
        }
        callback.onMenuOpened(108, menuC4903);
        return true;
    }

    @Override // p000.InterfaceC3370
    /* JADX INFO: renamed from: ۥۣ */
    public void mo2765(MenuC4903 menuC4903, boolean z) {
        C4626 c4626;
        MenuC4903 menuC4903Mo7310 = menuC4903.mo7310();
        int i = 0;
        boolean z2 = menuC4903Mo7310 != menuC4903;
        if (z2) {
            menuC4903 = menuC4903Mo7310;
        }
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f19165;
        C4626[] c4626Arr = layoutInflaterFactory2C1852.f6192;
        int length = c4626Arr != null ? c4626Arr.length : 0;
        while (true) {
            if (i < length) {
                c4626 = c4626Arr[i];
                if (c4626 != null && c4626.f15261 == menuC4903) {
                    break;
                } else {
                    i++;
                }
            } else {
                c4626 = null;
                break;
            }
        }
        if (c4626 != null) {
            if (!z2) {
                layoutInflaterFactory2C1852.m3644(c4626, z);
            } else {
                layoutInflaterFactory2C1852.m3646(c4626.f15262, c4626, menuC4903Mo7310);
                layoutInflaterFactory2C1852.m3644(c4626, true);
            }
        }
    }
}
