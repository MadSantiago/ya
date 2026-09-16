package p000;

/* JADX INFO: renamed from: ۥّؑۡٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1145 implements InterfaceC4883 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f3998;

    /* JADX INFO: renamed from: ۥٓ */
    public final C2600 f3999;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f4000;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5845 f4001;

    public C1145(C5845 c5845, long j, Object obj, C2600 c2600) {
        this.f4001 = c5845;
        this.f4000 = j;
        this.f3998 = obj;
        this.f3999 = c2600;
    }

    @Override // p000.InterfaceC4883
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1376() {
        C5845 c5845 = this.f4001;
        synchronized (c5845) {
            if (this.f4000 >= c5845.m9656()) {
                Object[] objArr = c5845.f19265;
                if (AbstractC5568.m9383(objArr, this.f4000) == this) {
                    AbstractC5568.m9390(objArr, this.f4000, AbstractC5568.f18391);
                    c5845.m9663();
                }
            }
        }
    }
}
