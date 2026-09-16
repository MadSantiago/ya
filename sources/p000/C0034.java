package p000;

/* JADX INFO: renamed from: ۥۖ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0034 extends AbstractC3538 {

    /* JADX INFO: renamed from: ۦۨ */
    public static final C0034 f6711 = new C0034();

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // p000.AbstractC3538
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo3983() {
        return null;
    }

    @Override // p000.AbstractC3538
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo3984() {
        return false;
    }

    @Override // p000.AbstractC3538
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo3985() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
