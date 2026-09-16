package p000;

/* JADX INFO: renamed from: ۦٕ۟ؗؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5358 implements InterfaceC5641 {

    /* JADX INFO: renamed from: ۥْ */
    public static final Object f17633 = new Object();

    /* JADX INFO: renamed from: ۦ۟ */
    public volatile Object f17634;

    /* JADX INFO: renamed from: ۦۨ */
    public volatile InterfaceC5641 f17635;

    /* JADX INFO: renamed from: ۥۣ */
    public static InterfaceC5641 m8950(InterfaceC5641 interfaceC5641) {
        if (interfaceC5641 instanceof C5358) {
            return interfaceC5641;
        }
        C5358 c5358 = new C5358();
        c5358.f17634 = f17633;
        c5358.f17635 = interfaceC5641;
        return c5358;
    }

    @Override // p000.InterfaceC4895
    public final Object get() {
        Object obj;
        Object obj2 = this.f17634;
        Object obj3 = f17633;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f17634;
            if (obj == obj3) {
                obj = this.f17635.get();
                Object obj4 = this.f17634;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f17634 = obj;
                this.f17635 = null;
            }
        }
        return obj;
    }
}
