package p000;

/* JADX INFO: renamed from: ۥؘؚؑۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0220 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f823;

    public C0220(String str) {
        this.f823 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0220.class != obj.getClass()) {
            return false;
        }
        return this.f823.equals(((C0220) obj).f823);
    }

    public final int hashCode() {
        return this.f823.hashCode();
    }

    public final String toString() {
        return AbstractC3761.m6621(new StringBuilder("Prop{name='"), this.f823, "'}");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m477(C5008 c5008) {
        Object obj = c5008.f16580.get(this);
        if (obj != null) {
            return obj;
        }
        C0178.m387(this.f823);
        return null;
    }
}
