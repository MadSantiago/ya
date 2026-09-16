package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: ۦٙؒؐۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4472 extends AbstractC4971 {

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ AtomicReferenceArray f14749;

    public C4472(long j, C4472 c4472, int i) {
        super(j, c4472, i);
        this.f14749 = new AtomicReferenceArray(AbstractC5566.f18375);
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f16448 + ", hashCode=" + hashCode() + ']';
    }

    @Override // p000.AbstractC4971
    /* JADX INFO: renamed from: ۥّ */
    public final int mo7620() {
        return AbstractC5566.f18375;
    }

    @Override // p000.AbstractC4971
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo7625(int i, InterfaceC3534 interfaceC3534) {
        this.f14749.set(i, AbstractC5566.f18374);
        m8355();
    }
}
