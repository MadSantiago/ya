package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥٜٜؖؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1836 implements InterfaceC5854 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C2790 f6104;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f6105;

    public C1836(C2790 c2790, int i) {
        this.f6104 = c2790;
        this.f6105 = i;
    }

    @Override // p000.InterfaceC5854
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo544(ArrayList arrayList, ArrayList arrayList2) {
        C2790 c2790 = this.f6104;
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = c2790.f9297;
        int i = this.f6105;
        if (abstractComponentCallbacksC0308 == null || i >= 0 || !abstractComponentCallbacksC0308.m659().m5280()) {
            return c2790.m5290(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
