package p000;

/* JADX INFO: renamed from: ۥؑؔۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0195 implements InterfaceC4083 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f722;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4083 f723;

    public C0195(InterfaceC4083 interfaceC4083, Object obj) {
        AbstractC3933.m7065(interfaceC4083, "log site key");
        this.f723 = interfaceC4083;
        AbstractC3933.m7065(obj, "log site qualifier");
        this.f722 = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0195)) {
            return false;
        }
        C0195 c0195 = (C0195) obj;
        return this.f723.equals(c0195.f723) && this.f722.equals(c0195.f722);
    }

    public final int hashCode() {
        return this.f722.hashCode() ^ this.f723.hashCode();
    }

    public final String toString() {
        String string = this.f723.toString();
        int length = string.length();
        String string2 = this.f722.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 3);
        sb.append("SpecializedLogSiteKey{ delegate='");
        sb.append(string);
        sb.append("', qualifier='");
        sb.append(string2);
        sb.append("' }");
        return sb.toString();
    }
}
