package p000;

/* JADX INFO: renamed from: ۥٝؔۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1883 {

    /* JADX INFO: renamed from: ۥۗ */
    public EnumC4972 f6252;

    /* JADX INFO: renamed from: ۥۣ */
    public String f6253;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1883)) {
            return false;
        }
        C1883 c1883 = (C1883) obj;
        return AbstractC3831.m6874(this.f6253, c1883.f6253) && this.f6252 == c1883.f6252;
    }

    public final int hashCode() {
        return this.f6252.hashCode() + (this.f6253.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f6253 + ", state=" + this.f6252 + ')';
    }
}
