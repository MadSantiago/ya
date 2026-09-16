package p000;

/* JADX INFO: renamed from: ۦٟۣؕۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4864 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f15997;

    /* JADX INFO: renamed from: ۥُ */
    public final float f15998;

    /* JADX INFO: renamed from: ۥّ */
    public final float f15999;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f16000;

    public C4864(float f, float f2, float f3, float f4) {
        super(2);
        this.f15997 = f;
        this.f16000 = f2;
        this.f15998 = f3;
        this.f15999 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4864)) {
            return false;
        }
        C4864 c4864 = (C4864) obj;
        return Float.compare(this.f15997, c4864.f15997) == 0 && Float.compare(this.f16000, c4864.f16000) == 0 && Float.compare(this.f15998, c4864.f15998) == 0 && Float.compare(this.f15999, c4864.f15999) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15999) + AbstractC3761.m6635(this.f15998, AbstractC3761.m6635(this.f16000, Float.hashCode(this.f15997) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f15997);
        sb.append(", dy1=");
        sb.append(this.f16000);
        sb.append(", dx2=");
        sb.append(this.f15998);
        sb.append(", dy2=");
        return AbstractC3761.m6639(sb, this.f15999, ')');
    }
}
