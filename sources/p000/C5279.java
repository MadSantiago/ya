package p000;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: ۦًۜؓۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5279 implements InterfaceC3228 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C0605 f17396;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C4855 f17397;

    public C5279(C4855 c4855, C0605 c0605) {
        this.f17397 = c4855;
        this.f17396 = c0605;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo3091(InterfaceC0151 interfaceC0151, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        C4855 c4855 = this.f17397;
        c4855.measure(iMakeMeasureSpec, AbstractC2535.m4763(0, i, c4855.getLayoutParams().height));
        return c4855.getMeasuredWidth();
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo4446(InterfaceC0151 interfaceC0151, List list, int i) {
        C4855 c4855 = this.f17397;
        c4855.measure(AbstractC2535.m4763(0, i, c4855.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c4855.getMeasuredHeight();
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo4447(InterfaceC0151 interfaceC0151, List list, int i) {
        C4855 c4855 = this.f17397;
        c4855.measure(AbstractC2535.m4763(0, i, c4855.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c4855.getMeasuredHeight();
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦِ */
    public final int mo4448(InterfaceC0151 interfaceC0151, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        C4855 c4855 = this.f17397;
        c4855.measure(iMakeMeasureSpec, AbstractC2535.m4763(0, i, c4855.getLayoutParams().height));
        return c4855.getMeasuredWidth();
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(InterfaceC2427 interfaceC2427, List list, long j) {
        C4855 c4855 = this.f17397;
        int childCount = c4855.getChildCount();
        C0204 c0204 = C0204.f751;
        if (childCount == 0) {
            return interfaceC2427.mo755(C3693.m6557(j), C3693.m6555(j), c0204, C1931.f6357);
        }
        if (C3693.m6557(j) != 0) {
            c4855.getChildAt(0).setMinimumWidth(C3693.m6557(j));
        }
        if (C3693.m6555(j) != 0) {
            c4855.getChildAt(0).setMinimumHeight(C3693.m6555(j));
        }
        c4855.measure(AbstractC2535.m4763(C3693.m6557(j), C3693.m6556(j), c4855.getLayoutParams().width), AbstractC2535.m4763(C3693.m6555(j), C3693.m6551(j), c4855.getLayoutParams().height));
        return interfaceC2427.mo755(c4855.getMeasuredWidth(), c4855.getMeasuredHeight(), c0204, new C5625(c4855, this.f17396, 1));
    }
}
