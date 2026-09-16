package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥۥٕؔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2739 {

    /* JADX INFO: renamed from: ۥؗ */
    public ArrayList f9067;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ C5034 f9068;

    /* JADX INFO: renamed from: ۥۗ */
    public ArrayList f9069;

    /* JADX INFO: renamed from: ۥۣ */
    public C2523 f9070;

    /* JADX INFO: renamed from: ۦؑ */
    public long f9071;

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1 A[RETURN] */
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m5091(long j, C5580 c5580) {
        C2523 c2523;
        if (this.f9067 == null) {
            this.f9067 = new ArrayList();
        }
        if (this.f9069 == null) {
            this.f9069 = new ArrayList();
        }
        if (this.f9067.isEmpty() || ((((C5580) this.f9067.get(0)).m9413() / 1000) / 60) / 60 == ((c5580.m9413() / 1000) / 60) / 60) {
            long jM8830 = this.f9071 + ((long) c5580.m8830());
            C5034 c5034 = this.f9068;
            if (!c5034.m8519().m1162(null, AbstractC4936.f19559)) {
                c5034.m8519();
                if (jM8830 < Math.max(0, ((Integer) AbstractC4936.f16322.m4592(null)).intValue())) {
                    this.f9071 = jM8830;
                    this.f9067.add(c5580);
                    this.f9069.add(Long.valueOf(j));
                    c2523 = this.f9070;
                    if (this.f9067.size() < Math.max(1, c5034.m8519().m1153(c2523 != null ? c2523.m4680() : null, AbstractC4936.f16339))) {
                        return true;
                    }
                }
            } else if (this.f9067.isEmpty()) {
                this.f9071 = jM8830;
                this.f9067.add(c5580);
                this.f9069.add(Long.valueOf(j));
                c2523 = this.f9070;
                if (this.f9067.size() < Math.max(1, c5034.m8519().m1153(c2523 != null ? c2523.m4680() : null, AbstractC4936.f16339))) {
                    return true;
                }
            } else {
                c5034.m8519();
                if (jM8830 < Math.max(0, ((Integer) AbstractC4936.f16322.m4592(null)).intValue())) {
                    this.f9071 = jM8830;
                    this.f9067.add(c5580);
                    this.f9069.add(Long.valueOf(j));
                    c2523 = this.f9070;
                    if (this.f9067.size() < Math.max(1, c5034.m8519().m1153(c2523 != null ? c2523.m4680() : null, AbstractC4936.f16339))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
