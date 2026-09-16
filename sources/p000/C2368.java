package p000;

/* JADX INFO: renamed from: ۥۜؒ٘ٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2368 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1259 f7849 = new C1259();

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f7850;

    public /* synthetic */ C2368(Object obj) {
        this.f7850 = obj;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final Object m4445(Object obj) {
        if (obj instanceof C1259) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2368) {
            return AbstractC3831.m6874(this.f7850, ((C2368) obj).f7850);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f7850;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f7850;
        if (obj instanceof C4577) {
            return ((C4577) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
