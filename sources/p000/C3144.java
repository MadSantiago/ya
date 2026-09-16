package p000;

/* JADX INFO: renamed from: ۦؒ۠٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3144 implements InterfaceC4112 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3510 f10611;

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC2776 f10612;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2384 f10613;

    public C3144(C2384 c2384, C2684 c2684, C3510 c3510) {
        this.f10613 = c2384;
        this.f10612 = c2684;
        this.f10611 = c3510;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3144)) {
            return false;
        }
        return AbstractC3831.m6874(this.f10612, ((C3144) obj).f10612);
    }

    public final int hashCode() {
        return this.f10612.hashCode();
    }

    @Override // p000.InterfaceC4112
    /* JADX INFO: renamed from: ۥُ */
    public final int mo5819(Object obj) {
        return this.f10611.m6297(obj);
    }

    @Override // p000.InterfaceC4112
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo5820(int i) {
        C3510 c3510 = this.f10611;
        Object[] objArr = (Object[]) c3510.f11624;
        int i2 = i - c3510.f11622;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.f10612.m5256(i) : obj;
    }

    @Override // p000.InterfaceC4112
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo5821() {
        return this.f10612.mo4990().f11622;
    }

    @Override // p000.InterfaceC4112
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo5822(int i, Object obj, C5362 c5362, int i2) {
        int i3;
        Object obj2;
        C5362 c5363;
        c5362.m8979(-1201380429);
        int i4 = (c5362.m8988(i) ? 4 : 2) | i2 | (c5362.m8977(obj) ? 32 : 16) | (c5362.m8963(this) ? 256 : 128);
        int i5 = 1;
        if (c5362.m9011(i4 & 1, (i4 & 147) != 146)) {
            c5363 = c5362;
            AbstractC3801.m6751(obj, i, this.f10613.f2343, AbstractC3925.m7034(1142237095, new C1335(this, i, i5), c5362), c5363, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
            obj2 = obj;
            i3 = i;
        } else {
            i3 = i;
            obj2 = obj;
            c5363 = c5362;
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0016(this, i3, obj2, i2, 7);
        }
    }
}
