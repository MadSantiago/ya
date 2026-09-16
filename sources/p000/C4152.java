package p000;

/* JADX INFO: renamed from: ۦٔؑؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4152 extends AbstractC3538 {

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f13837;

    public C4152(Object obj) {
        this.f13837 = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4152) {
            return this.f13837.equals(((C4152) obj).f13837);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13837.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13837);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // p000.AbstractC3538
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo3983() {
        return this.f13837;
    }

    @Override // p000.AbstractC3538
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo3984() {
        return true;
    }

    @Override // p000.AbstractC3538
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo3985() {
        return this.f13837;
    }
}
