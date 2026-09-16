package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: ۦٍۖؗۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4929 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ LayoutInflaterFactory2C1852 f16241;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16242;

    public /* synthetic */ RunnableC4929(LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852, int i) {
        this.f16242 = i;
        this.f16241 = layoutInflaterFactory2C1852;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f16242;
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f16241;
        switch (i) {
            case 0:
                if ((layoutInflaterFactory2C1852.f6174 & 1) != 0) {
                    layoutInflaterFactory2C1852.m3666(0);
                }
                if ((layoutInflaterFactory2C1852.f6174 & 4096) != 0) {
                    layoutInflaterFactory2C1852.m3666(108);
                }
                layoutInflaterFactory2C1852.f6146 = false;
                layoutInflaterFactory2C1852.f6174 = 0;
                break;
            default:
                layoutInflaterFactory2C1852.f6177.showAtLocation(layoutInflaterFactory2C1852.f6169, 55, 0, 0);
                C1551 c1551 = layoutInflaterFactory2C1852.f6182;
                if (c1551 != null) {
                    c1551.m3299();
                }
                if (layoutInflaterFactory2C1852.f6145 && (viewGroup = layoutInflaterFactory2C1852.f6187) != null && viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C1852.f6169.setAlpha(0.0f);
                    C1551 c1551M6432 = AbstractC3608.m6432(layoutInflaterFactory2C1852.f6169);
                    c1551M6432.m3300(1.0f);
                    layoutInflaterFactory2C1852.f6182 = c1551M6432;
                    c1551M6432.m3301(new C2751(0, this));
                } else {
                    layoutInflaterFactory2C1852.f6169.setAlpha(1.0f);
                    layoutInflaterFactory2C1852.f6169.setVisibility(0);
                }
                break;
        }
    }
}
