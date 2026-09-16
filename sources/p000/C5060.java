package p000;

/* JADX INFO: renamed from: ۦۘؗ٘ٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5060 implements InterfaceC4895 {

    /* JADX INFO: renamed from: ۥْ */
    public static final Object f16794 = new Object();

    /* JADX INFO: renamed from: ۦ۟ */
    public volatile Object f16795;

    /* JADX INFO: renamed from: ۦۨ */
    public volatile InterfaceC4895 f16796;

    /* JADX INFO: renamed from: ۥۣ */
    public static InterfaceC4895 m8606(InterfaceC4895 interfaceC4895) {
        if (interfaceC4895 instanceof C5060) {
            return interfaceC4895;
        }
        C5060 c5060 = new C5060();
        c5060.f16795 = f16794;
        c5060.f16796 = interfaceC4895;
        return c5060;
    }

    @Override // p000.InterfaceC4895
    public final Object get() {
        Object obj;
        Object obj2 = this.f16795;
        Object obj3 = f16794;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f16795;
                if (obj == obj3) {
                    obj = this.f16796.get();
                    Object obj4 = this.f16795;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16795 = obj;
                    this.f16796 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
