package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؙؓۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3536 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f11726;

    /* JADX INFO: renamed from: ۥُ */
    public final float f11727;

    /* JADX INFO: renamed from: ۥّ */
    public final long f11728;

    /* JADX INFO: renamed from: ۥْ */
    public C3536 f11729;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f11730;

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean f11731;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f11732;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f11733;

    /* JADX INFO: renamed from: ۦؚ */
    public final long f11734;

    /* JADX INFO: renamed from: ۦٌ */
    public final ArrayList f11735;

    /* JADX INFO: renamed from: ۦِ */
    public final long f11736;

    /* JADX INFO: renamed from: ۦٛ */
    public final int f11737;

    /* JADX INFO: renamed from: ۦۗ */
    public final float f11738;

    /* JADX INFO: renamed from: ۦۙ */
    public final long f11739;

    /* JADX INFO: renamed from: ۦۚ */
    public final long f11740;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f11741;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f11742;

    public C3536(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.f11732 = j;
        this.f11730 = j2;
        this.f11726 = j3;
        this.f11733 = z;
        this.f11727 = f;
        this.f11728 = j4;
        this.f11739 = j5;
        this.f11731 = z2;
        this.f11737 = i;
        this.f11736 = j6;
        this.f11738 = f2;
        this.f11734 = j7;
        this.f11740 = 0L;
        this.f11742 = z3;
        this.f11741 = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) AbstractC5378.m9056(this.f11732));
        sb.append(", uptimeMillis=");
        sb.append(this.f11730);
        sb.append(", position=");
        sb.append((Object) C1553.m3309(this.f11726));
        sb.append(", pressed=");
        sb.append(this.f11733);
        sb.append(", pressure=");
        sb.append(this.f11727);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f11728);
        sb.append(", previousPosition=");
        sb.append((Object) C1553.m3309(this.f11739));
        sb.append(", previousPressed=");
        sb.append(this.f11731);
        sb.append(", isConsumed=");
        sb.append(m6326());
        sb.append(", type=");
        sb.append((Object) C5407.m9088(this.f11737));
        sb.append(", historical=");
        Object obj = this.f11735;
        if (obj == null) {
            obj = C2340.f7777;
        }
        sb.append(obj);
        sb.append(", scrollDelta=");
        sb.append((Object) C1553.m3309(this.f11736));
        sb.append(", scaleFactor=");
        sb.append(this.f11738);
        sb.append(", panOffset=");
        sb.append((Object) C1553.m3309(this.f11734));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m6326() {
        C3536 c3536 = this.f11729;
        if (c3536 != null) {
            return c3536.m6326();
        }
        return this.f11742 || this.f11741;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6327() {
        C3536 c3536 = this.f11729;
        if (c3536 == null) {
            this.f11742 = true;
            this.f11741 = true;
        } else if (c3536 != null) {
            c3536.m6327();
        }
    }

    public C3536(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.f11735 = arrayList;
        this.f11740 = j8;
    }
}
