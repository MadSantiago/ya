package p000;

/* JADX INFO: renamed from: ۥٌؘۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2889 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f9637;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f9638 = 0;

    public C2889(InterfaceC1437 interfaceC1437, AbstractC0631 abstractC0631) {
        this.f9637 = interfaceC1437;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo927(float f) {
        int i = this.f9638;
        Object obj = this.f9637;
        switch (i) {
            case 0:
                C1392 c1392 = (C1392) obj;
                if (Float.isNaN(f)) {
                    return 0.0f;
                }
                float fFloatValue = ((Number) c1392.f4767.mo211(Float.valueOf(f))).floatValue();
                c1392.f4764.setValue(Boolean.valueOf(fFloatValue > 0.0f));
                c1392.f4765.setValue(Boolean.valueOf(fFloatValue < 0.0f));
                return fFloatValue;
            default:
                return ((InterfaceC1437) obj).mo927(f);
        }
    }

    public C2889(C1392 c1392) {
        this.f9637 = c1392;
    }
}
