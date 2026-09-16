package p000;

/* JADX INFO: renamed from: ۥؑؑۧؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0173 extends AbstractC1020 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f648;

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean f649;

    public C0173(String str, boolean z) {
        this.f649 = z;
        this.f648 = str.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0173.class != obj.getClass()) {
            return false;
        }
        C0173 c0173 = (C0173) obj;
        return this.f649 == c0173.f649 && AbstractC3831.m6874(this.f648, c0173.f648);
    }

    public final int hashCode() {
        return this.f648.hashCode() + (Boolean.hashCode(this.f649) * 31);
    }

    @Override // p000.AbstractC1020
    public final String toString() {
        boolean z = this.f649;
        String str = this.f648;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC0696.m1548(str, sb);
        return sb.toString();
    }

    @Override // p000.AbstractC1020
    /* JADX INFO: renamed from: ۥۗ */
    public final String mo362() {
        return this.f648;
    }
}
