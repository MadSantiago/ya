package p000;

/* JADX INFO: renamed from: ۥۖؔۜؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2066 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f6805;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f6806;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6807;

    public /* synthetic */ C2066(int i, long j, Object obj) {
        this.f6807 = i;
        this.f6806 = j;
        this.f6805 = obj;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) throws Exception {
        int i = this.f6807;
        long j = this.f6806;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f6805;
        switch (i) {
            case 0:
                String str = (String) obj2;
                InterfaceC3879 interfaceC3879 = (InterfaceC3879) obj;
                InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    interfaceC0252Mo971.mo532(j, 1);
                    interfaceC0252Mo971.mo530(2, str);
                    interfaceC0252Mo971.mo533();
                    return Integer.valueOf(C3133.m5787(interfaceC3879));
                } finally {
                    interfaceC0252Mo971.close();
                }
            case 1:
                String str2 = (String) obj2;
                InterfaceC0252 interfaceC0252Mo972 = ((InterfaceC3879) obj).mo971("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    interfaceC0252Mo972.mo532(j, 1);
                    interfaceC0252Mo972.mo530(2, str2);
                    interfaceC0252Mo972.mo533();
                    return c2358;
                } finally {
                    interfaceC0252Mo972.close();
                }
            default:
                InterfaceC2442.m4561((InterfaceC2442) obj, this.f6806, 0L, AbstractC4554.m7922(((Number) ((InterfaceC5372) obj2).getValue()).floatValue(), 0.0f, 1.0f), 118);
                return c2358;
        }
    }
}
