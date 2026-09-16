package p000;

/* JADX INFO: renamed from: ۦۛؕٛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5236 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f17287;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f17288;

    /* JADX INFO: renamed from: ۥّ */
    public final int f17289;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f17290;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f17291;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f17292;

    public C5236(int i, int i2, boolean z, boolean z2) {
        C4216 c4216 = AbstractC3026.f10188;
        int i3 = !z ? 262152 : 262144;
        i3 = i == 2 ? i3 | 8192 : i3;
        i3 = z2 ? i3 : i3 | 512;
        boolean z3 = i == 1;
        this.f17291 = i3;
        this.f17290 = z3;
        this.f17287 = true;
        this.f17292 = true;
        this.f17288 = true;
        this.f17289 = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5236)) {
            return false;
        }
        C5236 c5236 = (C5236) obj;
        return this.f17291 == c5236.f17291 && this.f17290 == c5236.f17290 && this.f17287 == c5236.f17287 && this.f17292 == c5236.f17292 && this.f17288 == c5236.f17288 && this.f17289 == c5236.f17289;
    }

    public final int hashCode() {
        return (AbstractC5078.m8672(AbstractC5078.m8672(AbstractC5078.m8672(AbstractC5078.m8672(AbstractC5078.m8672(this.f17291 * 31, 31, this.f17290), 31, this.f17287), 31, this.f17292), 31, this.f17288), 31, false) + this.f17289) * 31;
    }
}
