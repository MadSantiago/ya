package p000;

/* JADX INFO: renamed from: ۥٌؗٓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0916 implements InterfaceC2090 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final Object f3285 = new Object();

    /* JADX INFO: renamed from: ۥۗ */
    public volatile InterfaceC2090 f3286;

    /* JADX INFO: renamed from: ۥۣ */
    public volatile Object f3287 = f3285;

    public C0916(InterfaceC2090 interfaceC2090) {
        this.f3286 = interfaceC2090;
    }

    @Override // p000.InterfaceC2090
    public final Object get() {
        Object obj;
        Object obj2 = this.f3287;
        Object obj3 = f3285;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f3287;
                if (obj == obj3) {
                    obj = this.f3286.get();
                    this.f3287 = obj;
                    this.f3286 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
