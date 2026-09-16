package p000;

/* JADX INFO: renamed from: ۥۗۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2132 extends AbstractC0041 implements InterfaceC4137 {
    public AbstractC2132() {
        super(C0373.f1369);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC4489.m7777(this);
    }

    /* JADX INFO: renamed from: ۥؙ */
    public void mo1465(InterfaceC3534 interfaceC3534, Runnable runnable) throws C0768 {
        AbstractC5378.m9042(this, interfaceC3534, runnable);
    }

    /* JADX INFO: renamed from: ۥؚ */
    public abstract void mo1466(InterfaceC3534 interfaceC3534, Runnable runnable);

    @Override // p000.AbstractC0041, p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC4137 mo865(InterfaceC2218 interfaceC2218) {
        if (!(interfaceC2218 instanceof AbstractC0012)) {
            if (C0373.f1369 == interfaceC2218) {
                return this;
            }
            return null;
        }
        if (this.f8051 != ((AbstractC0012) interfaceC2218)) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ۥۡ */
    public boolean mo4118(InterfaceC3534 interfaceC3534) {
        return !(this instanceof AbstractC0950);
    }

    @Override // p000.AbstractC0041, p000.InterfaceC3534
    /* JADX INFO: renamed from: ۦؙ */
    public final InterfaceC3534 mo881(InterfaceC2218 interfaceC2218) {
        if (!(interfaceC2218 instanceof AbstractC0012)) {
            return C0373.f1369 == interfaceC2218 ? C4794.f15814 : this;
        }
        if (this.f8051 != ((AbstractC0012) interfaceC2218)) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ۦۧ */
    public AbstractC2132 mo4119(int i) {
        AbstractC3925.m7049(i);
        return new C0698(this, i);
    }
}
