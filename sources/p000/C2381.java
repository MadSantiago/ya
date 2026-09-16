package p000;

/* JADX INFO: renamed from: ۥۜؔ۠ٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2381 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC2609 f7895;

    /* JADX INFO: renamed from: ۥُ */
    public final Throwable f7896;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3011 f7897;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f7898;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f7899;

    public /* synthetic */ C2381(Object obj, C3011 c3011, InterfaceC2609 interfaceC2609, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : c3011, (i & 4) != 0 ? null : interfaceC2609, (Object) null, (i & 16) != 0 ? null : th);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C2381 m4460(C2381 c2381, C3011 c3011, Throwable th, int i) {
        Object obj = c2381.f7898;
        if ((i & 2) != 0) {
            c3011 = c2381.f7897;
        }
        C3011 c3012 = c3011;
        InterfaceC2609 interfaceC2609 = c2381.f7895;
        Object obj2 = c2381.f7899;
        if ((i & 16) != 0) {
            th = c2381.f7896;
        }
        return new C2381(obj, c3012, interfaceC2609, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2381)) {
            return false;
        }
        C2381 c2381 = (C2381) obj;
        return AbstractC3831.m6874(this.f7898, c2381.f7898) && AbstractC3831.m6874(this.f7897, c2381.f7897) && AbstractC3831.m6874(this.f7895, c2381.f7895) && AbstractC3831.m6874(this.f7899, c2381.f7899) && AbstractC3831.m6874(this.f7896, c2381.f7896);
    }

    public final int hashCode() {
        Object obj = this.f7898;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C3011 c3011 = this.f7897;
        int iHashCode2 = (iHashCode + (c3011 == null ? 0 : c3011.hashCode())) * 31;
        InterfaceC2609 interfaceC2609 = this.f7895;
        int iHashCode3 = (iHashCode2 + (interfaceC2609 == null ? 0 : interfaceC2609.hashCode())) * 31;
        Object obj2 = this.f7899;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f7896;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f7898 + ", cancelHandler=" + this.f7897 + ", onCancellation=" + this.f7895 + ", idempotentResume=" + this.f7899 + ", cancelCause=" + this.f7896 + ')';
    }

    public C2381(Object obj, C3011 c3011, InterfaceC2609 interfaceC2609, Object obj2, Throwable th) {
        this.f7898 = obj;
        this.f7897 = c3011;
        this.f7895 = interfaceC2609;
        this.f7899 = obj2;
        this.f7896 = th;
    }
}
