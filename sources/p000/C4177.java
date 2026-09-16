package p000;

/* JADX INFO: renamed from: ۦًٔؔۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4177 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0341[] f13908;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f13909;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4177(C0341[] c0341Arr, int i) {
        super(2);
        this.f13909 = i;
        this.f13908 = c0341Arr;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f13909;
        C0341[] c0341Arr = this.f13908;
        switch (i) {
            case 0:
                return Float.valueOf(AbstractC0993.m2164((AbstractC1842) obj, true, c0341Arr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC0993.m2164((AbstractC1842) obj, false, c0341Arr, ((Number) obj2).floatValue()));
        }
    }
}
