package p000;

/* JADX INFO: renamed from: ۦٜۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5853 extends AbstractC5381 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥً */
    public int f19303;

    /* JADX INFO: renamed from: ۥٕ */
    public InterfaceC5731 f19304;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f19305;

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(final InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        final AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(AbstractC0671.m1496(this.f19303 != 1 ? 0 : C3693.m6557(j), (this.f19303 == 1 || !this.f19305) ? C3693.m6556(j) : Integer.MAX_VALUE, this.f19303 == 2 ? C3693.m6555(j) : 0, (this.f19303 == 2 || !this.f19305) ? C3693.m6551(j) : Integer.MAX_VALUE));
        final int iM7934 = AbstractC4554.m7934(abstractC0275Mo3597.f985, C3693.m6557(j), C3693.m6556(j));
        final int iM7935 = AbstractC4554.m7934(abstractC0275Mo3597.f984, C3693.m6555(j), C3693.m6551(j));
        return interfaceC2427.mo755(iM7934, iM7935, C0204.f751, new InterfaceC4745() { // from class: ۦؚٜٟؒ
            @Override // p000.InterfaceC4745
            /* JADX INFO: renamed from: ۦؚ */
            public final Object mo211(Object obj) {
                InterfaceC5731 interfaceC5731 = this.f11931.f19304;
                AbstractC0275 abstractC0275 = abstractC0275Mo3597;
                AbstractC1842.m3624((AbstractC1842) obj, abstractC0275, ((C0873) interfaceC5731.mo219(new C4207((((long) (iM7934 - abstractC0275.f985)) << 32) | (((long) (iM7935 - abstractC0275.f984)) & 4294967295L)), interfaceC2427.getLayoutDirection())).f3199);
                return C2358.f7817;
            }
        });
    }
}
