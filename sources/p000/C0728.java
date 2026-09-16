package p000;

/* JADX INFO: renamed from: ۥؙؕؓٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0728 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f2659;

    public C0728(String str) {
        this.f2659 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0728) && this.f2659.equals(((C0728) obj).f2659);
    }

    public final int hashCode() {
        return this.f2659.hashCode();
    }

    public final String toString() {
        return AbstractC5078.m8678(new StringBuilder("OpaqueKey(key="), this.f2659, ')');
    }
}
