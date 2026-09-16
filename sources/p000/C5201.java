package p000;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ۦٕۚؗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5201 implements InterfaceC5130, Serializable {

    /* JADX INFO: renamed from: ۥْ */
    public static final AtomicReferenceFieldUpdater f17194 = AtomicReferenceFieldUpdater.newUpdater(C5201.class, Object.class, "ۦ۟");

    /* JADX INFO: renamed from: ۦ۟ */
    public volatile Object f17195;

    /* JADX INFO: renamed from: ۦۨ */
    public volatile InterfaceC4448 f17196;

    @Override // p000.InterfaceC5130
    public final Object getValue() {
        Object obj = this.f17195;
        C1397 c1397 = C1397.f4779;
        if (obj != c1397) {
            return obj;
        }
        InterfaceC4448 interfaceC4448 = this.f17196;
        if (interfaceC4448 != null) {
            Object objMo449 = interfaceC4448.mo449();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17194;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1397, objMo449)) {
                if (atomicReferenceFieldUpdater.get(this) != c1397) {
                }
            }
            this.f17196 = null;
            return objMo449;
        }
        return this.f17195;
    }

    public final String toString() {
        return this.f17195 != C1397.f4779 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
