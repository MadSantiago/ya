package p000;

import android.content.Context;
import android.view.View;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥٌؘؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0911 extends C2289 {

    /* JADX INFO: renamed from: ۦؚ */
    public final /* synthetic */ int f3274 = 0;

    /* JADX INFO: renamed from: ۦٌ */
    public final /* synthetic */ C4718 f3275;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0911(C4718 c4718, Context context, SubMenuC4103 subMenuC4103, View view) {
        super(context, subMenuC4103, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f3275 = c4718;
        if ((subMenuC4103.f13689.f3829 & 32) != 32) {
            View view2 = c4718.f15560;
            this.f7600 = view2 == null ? (View) c4718.f15571 : view2;
        }
        C5086 c5086 = c4718.f15567;
        this.f7603 = c5086;
        AbstractC1875 abstractC1875 = this.f7607;
        if (abstractC1875 != null) {
            abstractC1875.mo4534(c5086);
        }
    }

    @Override // p000.C2289
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1894() {
        int i = this.f3274;
        C4718 c4718 = this.f3275;
        switch (i) {
            case 0:
                c4718.f15564 = null;
                super.mo1894();
                break;
            default:
                MenuC4903 menuC4903 = c4718.f15555;
                if (menuC4903 != null) {
                    menuC4903.m8297(true);
                }
                c4718.f15566 = null;
                super.mo1894();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0911(C4718 c4718, Context context, MenuC4903 menuC4903, View view) {
        super(context, menuC4903, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f3275 = c4718;
        this.f7601 = 8388613;
        C5086 c5086 = c4718.f15567;
        this.f7603 = c5086;
        AbstractC1875 abstractC1875 = this.f7607;
        if (abstractC1875 != null) {
            abstractC1875.mo4534(c5086);
        }
    }
}
