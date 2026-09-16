package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦًٕؔۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3661 implements InterfaceC4161, InterfaceC3609 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ AtomicReference f12254;

    public C3661(AtomicReference atomicReference) {
        this.f12254 = atomicReference;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC4161) && (obj instanceof InterfaceC3609)) {
            return mo6143().equals(((InterfaceC3609) obj).mo6143());
        }
        return false;
    }

    public final int hashCode() {
        return mo6143().hashCode();
    }

    @Override // p000.InterfaceC3609
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0400 mo6143() {
        return new C2536(2, 4, AtomicReference.class, this.f12254, "set", "set(Ljava/lang/Object;)V");
    }

    @Override // p000.InterfaceC4161
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo978(Object obj, InterfaceC0443 interfaceC0443) {
        this.f12254.set((C2944) obj);
        return C2358.f7817;
    }
}
