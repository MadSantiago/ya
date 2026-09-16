package p000;

/* JADX INFO: renamed from: ۦۛؔۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5230 implements InterfaceC1827 {

    /* JADX INFO: renamed from: ۥْ */
    public final int f17256;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f17257;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC1827 f17258;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17259;

    public /* synthetic */ C5230(InterfaceC1827 interfaceC1827, int i, int i2, int i3) {
        this.f17259 = i3;
        this.f17258 = interfaceC1827;
        this.f17256 = i;
        this.f17257 = i2;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥؙ */
    public final int mo3596(int i) {
        switch (this.f17259) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f17258.mo3596(i);
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0275 mo3597(long j) {
        switch (this.f17259) {
            case 0:
                InterfaceC1827 interfaceC1827 = this.f17258;
                int i = this.f17257;
                int i2 = this.f17256;
                if (i == 1) {
                    return new C1867(i2 == 2 ? interfaceC1827.mo3599(C3693.m6551(j)) : interfaceC1827.mo3600(C3693.m6551(j)), C3693.m6553(j) ? C3693.m6551(j) : 32767, 0);
                }
                return new C1867(C3693.m6548(j) ? C3693.m6556(j) : 32767, i2 == 2 ? interfaceC1827.mo3598(C3693.m6556(j)) : interfaceC1827.mo3596(C3693.m6556(j)), 0);
            case 1:
                InterfaceC1827 interfaceC1828 = this.f17258;
                int i3 = this.f17257;
                int i4 = this.f17256;
                if (i3 == 1) {
                    return new C1867(i4 == 2 ? interfaceC1828.mo3599(C3693.m6551(j)) : interfaceC1828.mo3600(C3693.m6551(j)), C3693.m6553(j) ? C3693.m6551(j) : 32767, 1);
                }
                return new C1867(C3693.m6548(j) ? C3693.m6556(j) : 32767, i4 == 2 ? interfaceC1828.mo3598(C3693.m6556(j)) : interfaceC1828.mo3596(C3693.m6556(j)), 1);
            default:
                InterfaceC1827 interfaceC1829 = this.f17258;
                int i5 = this.f17257;
                int i6 = this.f17256;
                if (i5 == 1) {
                    return new C1867(i6 == 2 ? interfaceC1829.mo3599(C3693.m6551(j)) : interfaceC1829.mo3600(C3693.m6551(j)), C3693.m6553(j) ? C3693.m6551(j) : 32767, 2);
                }
                return new C1867(C3693.m6548(j) ? C3693.m6556(j) : 32767, i6 == 2 ? interfaceC1829.mo3598(C3693.m6556(j)) : interfaceC1829.mo3596(C3693.m6556(j)), 2);
        }
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3598(int i) {
        switch (this.f17259) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f17258.mo3598(i);
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo3599(int i) {
        switch (this.f17259) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f17258.mo3599(i);
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۦِ */
    public final Object mo570() {
        switch (this.f17259) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f17258.mo570();
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۦۣ */
    public final int mo3600(int i) {
        switch (this.f17259) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f17258.mo3600(i);
    }
}
