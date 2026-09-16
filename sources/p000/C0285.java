package p000;

/* JADX INFO: renamed from: ۥًؘؒٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0285 extends AbstractC0106 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0285 f1063 = new C0285(C2323.f7684);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // p000.AbstractC5224, p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public final void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        C1837 c1837 = (C1837) obj;
        boolean zMo5163 = interfaceC5308.mo5163(this.f423, i);
        c1837.mo2857(c1837.mo2859() + 1);
        boolean[] zArr = c1837.f6107;
        int i2 = c1837.f6106;
        c1837.f6106 = i2 + 1;
        zArr[i2] = zMo5163;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        C1837 c1837 = new C1837();
        c1837.f6107 = zArr;
        c1837.f6106 = zArr.length;
        c1837.mo2857(10);
        return c1837;
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo201() {
        return new boolean[0];
    }

    @Override // p000.AbstractC0106
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo202(C3782 c3782, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = zArr[i2];
            c3782.m6685(this.f423, i2);
            c3782.m6689(z);
        }
    }
}
