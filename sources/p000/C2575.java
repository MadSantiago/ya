package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥٟۡؖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2575 implements InterfaceC3862, Iterable, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥَ */
    public int f8593;

    /* JADX INFO: renamed from: ۥٓ */
    public int f8595;

    /* JADX INFO: renamed from: ۥٙ */
    public C4912 f8597;

    /* JADX INFO: renamed from: ۦٕ */
    public HashMap f8599;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f8600;

    /* JADX INFO: renamed from: ۦۛ */
    public int f8601;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f8602;

    /* JADX INFO: renamed from: ۦۨ */
    public int[] f8603 = new int[0];

    /* JADX INFO: renamed from: ۥْ */
    public Object[] f8594 = new Object[0];

    /* JADX INFO: renamed from: ۥٖ */
    public final Object f8596 = new Object();

    /* JADX INFO: renamed from: ۥۖ */
    public ArrayList f8598 = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3524(this, 0, this.f8602);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final C3222 m4871() {
        if (this.f8600) {
            C1078.m2276("Cannot read while a writer is pending");
            return null;
        }
        this.f8593++;
        return new C3222(this);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final C0126 m4872() {
        if (this.f8600) {
            AbstractC5508.m9201("Cannot start a writer when another writer is pending");
        }
        if (this.f8593 > 0) {
            AbstractC5508.m9201("Cannot start a writer when a reader is pending");
        }
        this.f8600 = true;
        this.f8601++;
        return new C0126(this);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m4873(C4356 c4356) {
        if (this.f8600) {
            AbstractC5508.m9201("Use active SlotWriter to determine anchor location instead");
        }
        if (!c4356.m7647()) {
            AbstractC0371.m795("Anchor refers to a group that was removed");
        }
        return c4356.f14359;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final AbstractC5020 m4874(int i) {
        int i2;
        ArrayList arrayList;
        int iM6808;
        HashMap map = this.f8599;
        if (map != null) {
            if (this.f8600) {
                AbstractC5508.m9201("use active SlotWriter to crate an anchor for location instead");
            }
            C4356 c4356 = (i < 0 || i >= (i2 = this.f8602) || (iM6808 = AbstractC3809.m6808((arrayList = this.f8598), i, i2)) < 0) ? null : (C4356) arrayList.get(iM6808);
            if (c4356 != null) {
                return (AbstractC5020) map.get(c4356);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m4875() {
        this.f8599 = new HashMap();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m4876(C4356 c4356) {
        int iM6808;
        return c4356.m7647() && (iM6808 = AbstractC3809.m6808(this.f8598, c4356.f14359, this.f8602)) >= 0 && AbstractC3831.m6874(this.f8598.get(iM6808), c4356);
    }
}
