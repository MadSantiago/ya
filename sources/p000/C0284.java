package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥًؘؒٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0284 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f1050;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f1051;

    /* JADX INFO: renamed from: ۥّ */
    public final float f1052;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f1053;

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean f1054;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f1055;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f1056;

    /* JADX INFO: renamed from: ۦؚ */
    public final long f1057;

    /* JADX INFO: renamed from: ۦٌ */
    public final long f1058;

    /* JADX INFO: renamed from: ۦِ */
    public final long f1059;

    /* JADX INFO: renamed from: ۦٛ */
    public final ArrayList f1060;

    /* JADX INFO: renamed from: ۦۗ */
    public final float f1061;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f1062;

    public C0284(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.f1055 = j;
        this.f1053 = j2;
        this.f1050 = j3;
        this.f1056 = j4;
        this.f1051 = z;
        this.f1052 = f;
        this.f1062 = i;
        this.f1054 = z2;
        this.f1060 = arrayList;
        this.f1059 = j5;
        this.f1061 = f2;
        this.f1057 = j6;
        this.f1058 = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0284)) {
            return false;
        }
        C0284 c0284 = (C0284) obj;
        return AbstractC5378.m9062(this.f1055, c0284.f1055) && this.f1053 == c0284.f1053 && C1553.m3306(this.f1050, c0284.f1050) && C1553.m3306(this.f1056, c0284.f1056) && this.f1051 == c0284.f1051 && Float.compare(this.f1052, c0284.f1052) == 0 && this.f1062 == c0284.f1062 && this.f1054 == c0284.f1054 && this.f1060.equals(c0284.f1060) && C1553.m3306(this.f1059, c0284.f1059) && Float.compare(this.f1061, c0284.f1061) == 0 && C1553.m3306(this.f1057, c0284.f1057) && C1553.m3306(this.f1058, c0284.f1058);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1058) + AbstractC3761.m6626(AbstractC3761.m6635(this.f1061, AbstractC3761.m6626((this.f1060.hashCode() + AbstractC5078.m8672(AbstractC2049.m3999(this.f1062, AbstractC3761.m6635(this.f1052, AbstractC5078.m8672(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(Long.hashCode(this.f1055) * 31, 31, this.f1053), 31, this.f1050), 31, this.f1056), 31, this.f1051), 31), 31), 31, this.f1054)) * 31, 31, this.f1059), 31), 31, this.f1057);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) AbstractC5378.m9056(this.f1055)) + ", uptime=" + this.f1053 + ", positionOnScreen=" + ((Object) C1553.m3309(this.f1050)) + ", position=" + ((Object) C1553.m3309(this.f1056)) + ", down=" + this.f1051 + ", pressure=" + this.f1052 + ", type=" + ((Object) C5407.m9088(this.f1062)) + ", activeHover=" + this.f1054 + ", historical=" + this.f1060 + ", scrollDelta=" + ((Object) C1553.m3309(this.f1059)) + ", scaleGestureFactor=" + this.f1061 + ", panGestureOffset=" + ((Object) C1553.m3309(this.f1057)) + ", originalEventPosition=" + ((Object) C1553.m3309(this.f1058)) + ')';
    }
}
