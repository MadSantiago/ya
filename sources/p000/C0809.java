package p000;

/* JADX INFO: renamed from: ۥؚۙؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0809 implements InterfaceC2864 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f2881;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0809 f2880 = new C0809(0);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0809 f2879 = new C0809(1);

    public /* synthetic */ C0809(int i) {
        this.f2881 = i;
    }

    public String toString() {
        switch (this.f2881) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC2864
    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC3925 mo1709(long j, EnumC2459 enumC2459, InterfaceC2880 interfaceC2880) {
        switch (this.f2881) {
            case 0:
                float fMo743 = interfaceC2880.mo743(30.0f);
                return new C2490(new C2793(0.0f, -fMo743, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fMo743));
            case 1:
                float fMo744 = interfaceC2880.mo743(30.0f);
                return new C2490(new C2793(-fMo744, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fMo744, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new C2490(AbstractC5568.m9368(0L, j));
        }
    }
}
