package p000;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥؙؓۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0717 implements InterfaceC4643 {

    /* JADX INFO: renamed from: ۥْ */
    public final InterfaceC4643 f2622;

    /* JADX INFO: renamed from: ۥٓ */
    public final AtomicReference f2623 = new AtomicReference(null);

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1568 f2624;

    /* JADX INFO: renamed from: ۦۨ */
    public final View f2625;

    public C0717(View view, C1568 c1568, InterfaceC4643 interfaceC4643) {
        this.f2625 = view;
        this.f2624 = c1568;
        this.f2622 = interfaceC4643;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m1585(C2734 c2734, AbstractC0772 abstractC0772) {
        C3784 c3784;
        if (abstractC0772 instanceof C3784) {
            c3784 = (C3784) abstractC0772;
            int i = c3784.f12575;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3784.f12575 = i - Integer.MIN_VALUE;
            } else {
                c3784 = new C3784(this, abstractC0772);
            }
        } else {
            c3784 = new C3784(this, abstractC0772);
        }
        Object obj = c3784.f12574;
        int i2 = c3784.f12575;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C5544 c5544 = new C5544(0, c2734, this);
            InterfaceC0443 interfaceC0443 = null;
            C0023 c0023 = new C0023(this, interfaceC0443, 3);
            c3784.f12575 = 1;
            if (AbstractC4009.m7173(new C1734(c5544, this.f2623, c0023, interfaceC0443, 8), c3784) == EnumC2282.f7590) {
                return;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC0186.m409(obj);
        }
        C1078.m2274();
    }

    @Override // p000.InterfaceC4643
    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC3534 mo1586() {
        return this.f2622.mo1586();
    }
}
