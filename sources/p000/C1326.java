package p000;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥٟٔؓؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1326 implements InterfaceC4790 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f4582;

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f4583 = new ArrayList();

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f4584;

    public C1326(C0605 c0605) {
        this.f4584 = c0605;
        this.f4582 = c0605;
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2813() {
        C5461 rectManager;
        C0193 c0193;
        C5461 rectManager2;
        C0605 c0605 = (C0605) this.f4582;
        C2457 c2457 = c0605.f2256;
        if (!c0605.m1348()) {
            AbstractC3480.m6279("onReuse is only expected on attached node");
        }
        C4855 c4855 = c0605.f2240;
        if (c4855 != null) {
            View view = c4855.f8416;
            if (view.getParent() != c4855) {
                c4855.addView(view);
            } else {
                c4855.f8400.mo449();
            }
        }
        C0851 c0851 = c0605.f2250;
        if (c0851 != null) {
            c0851.m1809(false);
        }
        c0605.f2263 = false;
        if (c0605.f2242) {
            c0605.f2242 = false;
        } else {
            AbstractC5381 abstractC5381 = (C1850) c0605.f2256.f8202;
            for (AbstractC5381 abstractC5382 = abstractC5381; abstractC5382 != null; abstractC5382 = abstractC5382.f17780) {
                if (abstractC5382.f17786) {
                    abstractC5382.mo5605();
                }
            }
            for (AbstractC5381 abstractC5383 = abstractC5381; abstractC5383 != null; abstractC5383 = abstractC5383.f17780) {
                if (abstractC5383.f17786) {
                    abstractC5383.mo5606();
                }
            }
            while (abstractC5381 != null) {
                if (abstractC5381.f17786) {
                    abstractC5381.mo5609();
                }
                abstractC5381 = abstractC5381.f17780;
            }
        }
        int i = c0605.f2273;
        InterfaceC2043 interfaceC2043 = c0605.f2259;
        if (interfaceC2043 != null && (rectManager2 = ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).getRectManager()) != null) {
            rectManager2.m9141(c0605);
        }
        c0605.f2273 = AbstractC1697.f5662.addAndGet(1);
        InterfaceC2043 interfaceC2044 = c0605.f2259;
        if (interfaceC2044 != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = (ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2044;
            viewTreeObserverOnGlobalLayoutListenerC0850.m9771getLayoutNodes().m8320(i);
            viewTreeObserverOnGlobalLayoutListenerC0850.m9771getLayoutNodes().m8319(c0605.f2273, c0605);
        }
        for (AbstractC5381 abstractC5384 = (AbstractC5381) c2457.f8210; abstractC5384 != null; abstractC5384 = abstractC5384.f17783) {
            abstractC5384.mo5608();
        }
        c2457.m4591();
        if (c2457.m4585(8)) {
            c0605.m1334();
        }
        C0605.m1311(c0605);
        InterfaceC2043 interfaceC2045 = c0605.f2259;
        if (interfaceC2045 != null && (c0193 = ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2045).f3131) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0851 = c0193.f713;
            C3121 c3121 = c0193.f720;
            C0482 c0482 = c0193.f718;
            if (c0482.m1030(i)) {
                c3121.m5743(viewTreeObserverOnGlobalLayoutListenerC0851, i, false);
            }
            C2542 c2542M1331 = c0605.m1331();
            if (c2542M1331 != null && c2542M1331.f8490.m6018(AbstractC2771.f9203)) {
                c0482.m1032(c0605.f2273);
                c3121.m5743(viewTreeObserverOnGlobalLayoutListenerC0851, c0605.f2273, true);
            }
        }
        InterfaceC2043 interfaceC2046 = c0605.f2259;
        if (interfaceC2046 == null || (rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2046).getRectManager()) == null) {
            return;
        }
        rectManager.m9136(c0605);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2814() {
        InterfaceC2043 interfaceC2043 = ((C0605) this.f4584).f2259;
        if (interfaceC2043 != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1774();
        }
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥّ */
    public final void mo2815(int i, int i2, int i3) {
        ((C0605) this.f4582).m1355(i, i2, i3);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2816(Object obj) {
        this.f4583.add(this.f4582);
        this.f4582 = obj;
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo2817(int i, int i2) {
        ((C0605) this.f4582).m1330(i, i2);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2818(int i, Object obj) {
        ((C0605) this.f4582).m1343(i, (C0605) obj);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2819(int i, Object obj) {
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۦِ */
    public final void mo2820() {
        ArrayList arrayList = this.f4583;
        this.f4582 = arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m2821() {
        this.f4583.clear();
        this.f4582 = this.f4584;
        ((C0605) this.f4584).m1328();
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo2822() {
        return this.f4582;
    }
}
