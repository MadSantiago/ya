package p000;

/* JADX INFO: renamed from: ۦۥؑۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5693 extends C5845 implements InterfaceC4311 {
    @Override // p000.InterfaceC4311
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) AbstractC5568.m9383(this.f19265, (this.f19262 + ((long) ((int) ((m9656() + ((long) this.f19261)) - this.f19262)))) - 1)).intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m9505(int i) {
        synchronized (this) {
            m9665(Integer.valueOf(((Number) AbstractC5568.m9383(this.f19265, (this.f19262 + ((long) ((int) ((m9656() + ((long) this.f19261)) - this.f19262)))) - 1)).intValue() + i));
        }
    }
}
