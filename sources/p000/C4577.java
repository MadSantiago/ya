package p000;

/* JADX INFO: renamed from: ۦٖٚؗؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4577 extends C1259 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Throwable f15107;

    public C4577(Throwable th) {
        this.f15107 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4577) {
            return AbstractC3831.m6874(this.f15107, ((C4577) obj).f15107);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f15107;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p000.C1259
    public final String toString() {
        return "Closed(" + this.f15107 + ')';
    }
}
