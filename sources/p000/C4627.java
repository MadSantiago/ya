package p000;

/* JADX INFO: renamed from: ۦؘٛؕٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4627 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f15273;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f15274;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4627(int i, Object obj) {
        super(1);
        this.f15274 = i;
        this.f15273 = obj;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) throws C0768 {
        int i = this.f15274;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f15273;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                C5475 c5475 = (C5475) obj2;
                C2600 c2600 = c5475.f18066;
                if (c2600 != null) {
                    c2600.mo3713(th);
                }
                c5475.f18066 = null;
                break;
            default:
                C1117 c1117 = (C1117) obj;
                C2096 c2096 = (C2096) obj2;
                c1117.m2347(c2096.f6896);
                c1117.m2345(c2096.f6905);
                c1117.m2338(c2096.f6897);
                c1117.m2344(c2096.f6898);
                float f = c2096.f6902;
                if (c1117.f3928 != f) {
                    c1117.f3930 |= 2048;
                    c1117.f3928 = f;
                }
                c1117.m2343(c2096.f6900);
                c1117.m2346(c2096.f6899);
                c1117.m2340(c2096.f6901);
                c1117.m2339(c2096.f6903);
                c1117.m2342(c2096.f6904);
                int i2 = c2096.f6895;
                if (c1117.f3917 != i2) {
                    c1117.f3930 |= 524288;
                    c1117.f3917 = i2;
                }
                break;
        }
        return c2358;
    }
}
