package p000;

import android.content.Context;

/* JADX INFO: renamed from: ۦؚؖؗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3376 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f11261;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2880 f11262;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f11263;

    /* JADX INFO: renamed from: ۦؑ */
    public final C1393 f11264;

    public C3376(Context context, InterfaceC2880 interfaceC2880, long j, C1393 c1393) {
        this.f11263 = context;
        this.f11262 = interfaceC2880;
        this.f11261 = j;
        this.f11264 = c1393;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C3376.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C3376 c3376 = (C3376) obj;
        if (!AbstractC3831.m6874(this.f11263, c3376.f11263) || !AbstractC3831.m6874(this.f11262, c3376.f11262)) {
            return false;
        }
        long j = c3376.f11261;
        int i = C1327.f4593;
        return C4462.m7744(this.f11261, j) && this.f11264.equals(c3376.f11264);
    }

    public final int hashCode() {
        int iHashCode = (this.f11262.hashCode() + (this.f11263.hashCode() * 31)) * 31;
        int i = C1327.f4593;
        return this.f11264.hashCode() + AbstractC3761.m6626(iHashCode, 31, this.f11261);
    }
}
