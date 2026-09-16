package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦؘِؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3306 implements InterfaceC0806 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0400 f11068;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f11069;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f11070;

    public /* synthetic */ C3306(Object obj, InterfaceC0400 interfaceC0400, int i) {
        this.f11070 = i;
        this.f11069 = obj;
        this.f11068 = interfaceC0400;
    }

    @Override // p000.InterfaceC0806
    public final Iterator iterator() {
        switch (this.f11070) {
            case 0:
                return new C2960(this);
            default:
                return new C0754(this);
        }
    }
}
