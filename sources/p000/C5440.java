package p000;

/* JADX INFO: renamed from: ۦّۡؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5440 implements InterfaceC4112 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C4068 f17948;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4801 f17949;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0846 f17950;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3510 f17951;

    public C5440(C0846 c0846, C4801 c4801, C4068 c4068, C3510 c3510) {
        this.f17950 = c0846;
        this.f17949 = c4801;
        this.f17948 = c4068;
        this.f17951 = c3510;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5440)) {
            return false;
        }
        return AbstractC3831.m6874(this.f17949, ((C5440) obj).f17949);
    }

    public final int hashCode() {
        return this.f17949.hashCode();
    }

    @Override // p000.InterfaceC4112
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo7314(int i) {
        C4014 c4014M6296 = this.f17949.f15839.m6296(i);
        return c4014M6296.f13380.mo5523().mo211(Integer.valueOf(i - c4014M6296.f13382));
    }

    @Override // p000.InterfaceC4112
    /* JADX INFO: renamed from: ۥُ */
    public final int mo5819(Object obj) {
        return this.f17951.m6297(obj);
    }

    @Override // p000.InterfaceC4112
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo5820(int i) {
        C3510 c3510 = this.f17951;
        Object[] objArr = (Object[]) c3510.f11624;
        int i2 = i - c3510.f11622;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.f17949.m5256(i) : obj;
    }

    @Override // p000.InterfaceC4112
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo5821() {
        return this.f17949.mo4990().f11622;
    }

    @Override // p000.InterfaceC4112
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo5822(int i, Object obj, C5362 c5362, int i2) {
        int i3;
        Object obj2;
        C5362 c5363;
        c5362.m8979(-462424778);
        int i4 = (c5362.m8988(i) ? 4 : 2) | i2 | (c5362.m8977(obj) ? 32 : 16) | (c5362.m8963(this) ? 256 : 128);
        int i5 = 0;
        if (c5362.m9011(i4 & 1, (i4 & 147) != 146)) {
            c5363 = c5362;
            AbstractC3801.m6751(obj, i, this.f17950.f3023, AbstractC3925.m7034(-824725566, new C1335(this, i, i5), c5362), c5363, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
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
            c5863M8965.f19365 = new C0016(this, i3, obj2, i2, 6);
        }
    }
}
