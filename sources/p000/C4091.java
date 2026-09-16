package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؘؘْؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4091 {

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f13659;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f13660;

    public C4091(String str, ArrayList arrayList) {
        if (str == null) {
            C0178.m387("Null userAgent");
            throw null;
        }
        this.f13660 = str;
        this.f13659 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4091)) {
            return false;
        }
        C4091 c4091 = (C4091) obj;
        return this.f13660.equals(c4091.f13660) && this.f13659.equals(c4091.f13659);
    }

    public final int hashCode() {
        return this.f13659.hashCode() ^ ((this.f13660.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f13660 + ", usedDates=" + this.f13659 + "}";
    }
}
