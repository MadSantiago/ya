package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦُٖؔۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4299 implements InterfaceC0806 {

    /* JADX INFO: renamed from: ۥۣ */
    public final AtomicReference f14228;

    public C4299(InterfaceC0806 interfaceC0806) {
        this.f14228 = new AtomicReference(interfaceC0806);
    }

    @Override // p000.InterfaceC0806
    public final Iterator iterator() {
        InterfaceC0806 interfaceC0806 = (InterfaceC0806) this.f14228.getAndSet(null);
        if (interfaceC0806 != null) {
            return interfaceC0806.iterator();
        }
        C1078.m2276("This sequence can be consumed only once.");
        return null;
    }
}
