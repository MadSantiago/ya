package p000;

/* JADX INFO: renamed from: ۦۣ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5435 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Long f17928;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f17929;

    public C5435(String str, Long l) {
        this.f17929 = str;
        this.f17928 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5435)) {
            return false;
        }
        C5435 c5435 = (C5435) obj;
        return this.f17929.equals(c5435.f17929) && this.f17928.equals(c5435.f17928);
    }

    public final int hashCode() {
        return this.f17928.hashCode() + (this.f17929.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.f17929 + ", value=" + this.f17928 + ')';
    }
}
