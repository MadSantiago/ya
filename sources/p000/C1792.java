package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ۥْٛؗٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1792 implements InterfaceC0443, InterfaceC4853 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final AtomicReferenceFieldUpdater f5990 = AtomicReferenceFieldUpdater.newUpdater(C1792.class, Object.class, "result");
    private volatile Object result;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC0443 f5991;

    public C1792(InterfaceC0443 interfaceC0443) {
        EnumC2282 enumC2282 = EnumC2282.f7590;
        this.f5991 = interfaceC0443;
        this.result = enumC2282;
    }

    public final String toString() {
        return "SafeContinuation for " + this.f5991;
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3534 mo334() {
        return this.f5991.mo334();
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥّ */
    public final void mo335(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5990;
        while (true) {
            Object obj2 = this.result;
            EnumC2282 enumC2282 = EnumC2282.f7589;
            if (obj2 == enumC2282) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC2282, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC2282) {
                    }
                }
                return;
            }
            EnumC2282 enumC2283 = EnumC2282.f7590;
            if (obj2 != enumC2283) {
                C1078.m2276("Already resumed");
                return;
            }
            EnumC2282 enumC2284 = EnumC2282.f7587;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, enumC2283, enumC2284)) {
                    this.f5991.mo335(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == enumC2283);
        }
    }

    @Override // p000.InterfaceC4853
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4853 mo3583() {
        InterfaceC0443 interfaceC0443 = this.f5991;
        if (interfaceC0443 instanceof InterfaceC4853) {
            return (InterfaceC4853) interfaceC0443;
        }
        return null;
    }
}
